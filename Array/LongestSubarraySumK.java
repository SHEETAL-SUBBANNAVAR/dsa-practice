/*             Problem: Longest Subarray with Given Sum K
Description:
        Given an array of integers nums of size n and an integer k,
        find the length of the longest subarray whose sum is equal to k.
        If no such subarray exists, return 0.

Approach:
        - Since the array contains positive numbers, we can use the Sliding Window technique.
        - Maintain two pointers (left and right) and a running sum.
        - Expand the window by moving the right pointer.
        - If the sum exceeds k, shrink the window from the left.
        - If the sum equals k, update the maximum length.
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: nums = [10, 5, 2, 7, 1, 9], k = 15
Output: 4
Explanation: Subarray [5, 2, 7, 1] has sum = 15 and length = 4.
*/
public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right =0 ;right<arr.length;right++ ){
            sum+=arr[right];
            while(sum>k && left <=  right){
                sum-= arr[left];
                left++;
            }
            if(sum == k){
                maxLen =Math.max(maxLen, right-left+1);
            }
        }
        System.out.println(maxLen);
    }
}