/*        LONGEST CONSECUTIVE SEQUENCE (OPTIMAL)
          ======================================
Problem: Given an unsorted array nums[], find the length of the longest sequence of consecutive elements.
Example: Input: {100,4,200,1,3,2}       Output: 4  → Sequence: {1,2,3,4}
         Input: {0,3,7,2,5,8,4,6,0,1}         Output: 9

Optimal Approach (Using HashSet)
    Logic:- Insert all elements into a HashSet
          - Traverse each element:
                If (num - 1) is NOT in set:
                    → It is the start of a sequence
                    → Initialize count = 1
                    → current = num
                    While (current + 1) exists in set:
                        → current++
                        → count++
                    → Update maxLength

    Advantages:- True O(N) solution
               - Efficient for large inputs
    Time Complexity: O(N)
    Space Complexity: O(N)
*/
package Medium;

import java.util.*;


public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        int current = 0;
        int maxLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            if (!set.contains(arr[i] - 1)) {
                int count = 1;
                current = arr[i];
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                    maxLength = Math.max(maxLength, count);
                }
            }
        }
        System.out.println(maxLength);

    }
}
