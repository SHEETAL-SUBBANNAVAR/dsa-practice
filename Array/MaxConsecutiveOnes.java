/*           MAXIMUM CONSECUTIVE ONES
             =========================

Problem: Given a binary array nums (only 0s and 1s),return the maximum number of consecutive 1's.
Example: Input: nums = [1, 1, 0, 1, 1, 1]        Output: 3

Linear Traversal (Optimal)
    Logic:- Initialize count = 0 and maxCount = 0
          - Traverse the array
          - If element is 1 → increment count
          - If element is 0 → reset count to 0
          - Update maxCount = max(maxCount, count)
          - Return maxCount at the end

    Advantages:- Simple and efficient
               - Uses single loop
               - No extra space required

    Time Complexity: O(n)
    Space Complexity: O(1)

Edge Cases:- Array is empty → return 0
           - All elements are 0 → return 0
           - All elements are 1 → return length of array
           - Single element array
*/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int result = maxconsecutiveones(arr);
        System.out.println("the  maximum number of consecutive 1's :" + result);
    }

    public static int maxconsecutiveones(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;
        int maxcount = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
            }else{
                count=0;
            }
            maxcount = Math.max(maxcount ,count);
        }
        return maxcount;
    }
}
