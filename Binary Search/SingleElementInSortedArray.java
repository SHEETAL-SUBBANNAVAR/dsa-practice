/*        SINGLE ELEMENT IN SORTED ARRAY
         ================================
Problem: Given a sorted array where every element appears exactly twiceexcept one element which appears only once, find that single element.
Example: Input: nums = [1,1,2,3,3,4,4,8,8]      Output: 2
Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - While low < high:
                mid = (low + high) / 2
          - Ensure mid is even index:
                If mid is odd → mid--
               - Compare nums[mid] with nums[mid + 1]:
                If equal: → Single element lies in right half
                           → low = mid + 2

                Else:
                    → Single element lies in left half (including mid)
                    → high = mid
          - Finally, nums[low] is the single element
    Advantages:- Efficient O(log n)
               - No extra space required

    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 }; // o/p=2
        singleele(arr, 0, arr.length - 1);
    }

    public static void singleele(int[] arr, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (mid % 2 == 1) {
                mid--;   
            } 
            if (arr[mid] == arr[mid + 1]) {
                    low = mid + 2;
            } else {
                    high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}
