/*        MAXIMUM SUBARRAY (OPTIMAL - KADANE’S ALGORITHM)
          ===============================================
Problem: Given an integer array nums[], find the contiguous subarray with the largest sum and return that sum.
Example: Input: {-2,1,-3,4,-1,2,1,-5,4}          Output: 6   → Subarray: {4,-1,2,1}

Kadane’s Algorithm (Optimal)
    Logic:- Maintain: currentSum = 0
                      maxSum = -∞
          - Traverse array:
                currentSum += nums[i]
                Update maxSum:
                    maxSum = max(maxSum, currentSum)
                If currentSum < 0:
                    → Reset currentSum = 0
    Time Complexity: O(N)
    Space Complexity: O(1)
*/
package Medium;
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = sum(arr);
        System.out.print("Subarray: ");
        for (int i = result[0]; i <= result[1]; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sum(int[] arr) {
        int currentSum = 0;
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currentSum == 0) {
                tempStart = i;
            }
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return new int[] { start, end };
    }
}