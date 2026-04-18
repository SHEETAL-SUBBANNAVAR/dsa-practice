/*        FIND SINGLE NUMBER (ELEMENT APPEARS ONCE)
          =======================================
Problem: Given a non-empty array of integers arr, every element appears twice 
         except for one. Find that single one.
Example: Input: arr[] = {2,2,1}          Output: 1
         Input: arr[] = {4,1,2,1,2}      Output: 4

Bit Manipulation (Optimal - XOR)
    Logic:- Initialize result = 0
          - Traverse through the array:
                result = result ^ arr[i]
          - XOR properties used:
                a ^ a = 0   (same numbers cancel out)
                a ^ 0 = a   (number remains same)
          - So all duplicate elements cancel each other,
            leaving only the single element.
    Advantages:- O(n) time complexity
               - No extra space required
               - Very efficient and clean solution

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr1 = { 2,2,1};
        int arr2[] = {4, 1, 2, 1, 2};
        System.out.println(findSingle(arr1)); // Output: 1
        System.out.println(findSingle(arr2)); // Output: 4
    }
    public static int findSingle(int[] arr) {
        int n =arr.length ;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}