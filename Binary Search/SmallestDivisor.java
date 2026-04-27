/*        SMALLEST DIVISOR GIVEN A THRESHOLD (OPTIMAL)
          ===========================================
Problem: Given an array arr[] and a threshold limit,find the smallest divisor such that:
            sum of ceil(arr[i] / divisor) <= limit
Example: Input: {1,2,3,4,5}, limit = 8
         Output: 3
         Input: {8,4,2,3}, limit = 10
         Output: 2

Binary Search on Answer (Optimal)
    Logic:- The divisor lies between:
                low = 1
                high = max(arr)
          - While low <= high:
                mid = (low + high) / 2
          - Compute sum:
                For each element:
                    sum += ceil(arr[i] / mid)
          - Check:
                If sum <= limit:
                    → Possible answer
                    → Try smaller divisor
                    → high = mid - 1
                Else:
                    → Need larger divisor
                    → low = mid + 1
          - Final answer = low
    Time Complexity: O(N * log(max(arr)))
    Space Complexity: O(1)
*/class SmallestDivisor {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int limit1 = 8;
        int arr2[] = {8,4,2,3};
        int limit2 = 10;
        System.out.println(smallestDivisor(arr1, limit1)); // 3
        System.out.println(smallestDivisor(arr2, limit2)); // 2
    }
    public static int smallestDivisor(int arr[], int limit) {
        int low = 1;
        int high = 0;
        for (int num : arr) {
            if (num > high) {
                high = num;
            }
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = 0;
            for (int num : arr) {
                sum += (num + mid - 1) / mid; 
            }
            if (sum <= limit) {
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    
}