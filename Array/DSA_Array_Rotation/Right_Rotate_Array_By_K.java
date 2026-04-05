
/*           RIGHT ROTATE ARRAY BY K PLACES
Problem: Given an array, rotate it to the right by K positions.

Example:
Input:  [1, 2, 3, 4, 5], K = 2
Output: [4, 5, 1, 2, 3]

Reversal Algorithm (Optimal)
        Logic:- Reverse entire array
              - Reverse first K elements
              - Reverse remaining N-K elements
        Advantages:- In-place rotation
                   - No extra space required
        Time Complexity: O(n)
        Space Complexity: O(1)
*/
// package DSA_Array_Rotation;

import java.util.Arrays;
public class Right_Rotate_Array_By_K {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;
        Right_Rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void Right_Rotate(int arr[], int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
