package DSA_Array_Rotation;

/*           LEFT ROTATE ARRAY BY K PLACES
Problem:Given an array, rotate it to the left by K positions.

Example:
Input:  [1, 2, 3, 4, 5], K = 2
Output: [3, 4, 5, 1, 2]

Approach 1: Brute Force (Using Extra Array)
        Logic:- Copy first K elements into a temporary array
              - Shift remaining elements to the left
              - Place stored elements at the end
        Time Complexity: O(n)
        Space Complexity: O(k)

Approach 2: Reversal Algorithm (Optimal)
            Logic:- Reverse first K elements
                - Reverse remaining N-K elements
                - Reverse entire array 
            Advantages:- In-place rotation
                       - No extra space required
            Time Complexity: O(n)
            Space Complexity: O(1)


*/
import java.util.*;

public class Left_rotate_k_terms {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };  
        int k = 2;
        int[] arr2 = { 23, 543, 654, 76, 87, 98 };
        int l = 8;

        leftrotate_k_terms(arr, k);
        System.out.println(Arrays.toString(arr));

        leftrotate_k2_terms(arr2, l);
        System.out.println(Arrays.toString(arr2));
    }

    // Approach 1: Brute Force
    public static void leftrotate_k_terms(int arr[], int k) {
        int n = arr.length;
        int l = k % n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = n - l - 1; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - l - 1; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];

        }
       
    }
    //Approach 2: Reversal Algorithm
    public static void leftrotate_k2_terms(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
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
