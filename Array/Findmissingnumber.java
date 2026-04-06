/*               FIND MISSING NUMBER
              =========================

Problem:Given an array containing n distinct numbers in the range [0, n], find the one number that is missing.

Example:
Input:  [3, 0, 1] Output: 2
Input:  [0, 1] Output: 2

Approach 1: Using HashSet
        Logic:- Store all elements in a set
            - Check from 0 to n which number is missing
        Time Complexity: O(n)
        Space Complexity: O(n)

Approach 2: Sum Formula (Optimal)
        Logic:- Total sum of numbers from 0 to n = n*(n+1)/2
              - Subtract sum of array from total sum
        Advantages:- No extra space
                   - Very efficient
        Time Complexity: O(n)
        Space Complexity: O(1)


Edge Cases:
- Missing number is 0
- Missing number is n
- Single element array

*/

import java.util.HashMap;
import java.util.HashSet;

public class Findmissingnumber {
    public static void main(String[] args) {
        int[] arr1 = { 3, 0, 1 }; // Output: 2
        int[] arr2 = { 0, 1 }; // Output: 2
        missingNumberUsingSet(arr1);
        missingNumberUsingSet(arr2);
        missingNumberUsingSum(arr1);
        missingNumberUsingSum(arr2);
    }

    public static void missingNumberUsingSet(int[] arr) { // Approach 1: Using HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println("Missing element is: " + i);
                return;
            }
        }
    }

    public static void missingNumberUsingSum(int[] arr) { // Approach 2: Sum Formula
        int n = arr.length;
        int total = n * (n + 1) / 2;
        int actualsum = 0;
        for (int num : arr) {
            actualsum = actualsum + num;
        }
        int missingelemt = total - actualsum;
        System.out.println("Missing element is: " + missingelemt);

    }
}
