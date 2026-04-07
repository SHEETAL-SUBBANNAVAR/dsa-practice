/*        LOWER BOUND (BINARY SEARCH)
          ============================
Problem: Given a sorted array nums and a value X,  find the first index where element is greater than or equal to X.
         (i.e., first position where nums[i] >= X)

Example: Input: nums = [1, 3, 5, 7, 9], X = 6         Output: 3  (nums[3] = 7)

Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n
          - While low < high:
                mid = (low + high) / 2
                If nums[mid] >= X → move left (high = mid)
                Else → move right (low = mid + 1)
          - Return low (answer index)
    Advantages:- Works in logarithmic time
               - Finds first valid position
               - Useful in many problems

    Time Complexity: O(log n)
    Space Complexity: O(1)
*/

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        int X = 6;
        int result = lowerBound(nums, X);
        System.out.println("Lower bound index: " + result);
    }
    public static int lowerBound(int[] nums, int X) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= X) {
                high = mid; 
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }
}
