/*        LONGEST SUBARRAY WITH SUM = 0
          =============================
Problem: Given an array containing both positive and negative integers,
         find the length of the longest subarray with sum equal to zero.
Example: Input: arr[] = {9, -3, 3, -1, 6, -5}  
         Output: 5
         Input: arr[] = {6, -2, 2, -8, 1, 7, 4, -10}  
         Output: 8

Logic:- Use a variable sum = 0 and a HashMap to store: (prefixSum → first index)
          - Traverse array:
                sum += arr[i]
          - Cases:
                1. If sum == 0:
                        → Subarray from 0 to i has sum 0
                        → length = i + 1
                2. If sum already exists in map:
                        → Subarray between previous index+1 to i has sum 0
                        → length = i - previous_index
                3. If sum not in map:
                        → Store sum with current index
            - Keep track of maximum length

    Key Insight:- Same prefix sum repeating means elements in between sum to zero
    Advantages:- Works for both positive and negative numbers
               - Much better than brute force
    Time Complexity: O(N)
    Space Complexity: O(N)
*/

import java.util.HashMap;

public class LongestSubarrayWithZeroSum{
    public static void main(String[] args) {
        int arr [] = { 9, -3, 3, -1, 6, -5};
        int maxLen=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0 ;
        for(int i =0 ;i<arr.length;i++){
            sum+=arr[i];
           
            if(sum ==0){
                maxLen =i+1;;
            }
              if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }
}