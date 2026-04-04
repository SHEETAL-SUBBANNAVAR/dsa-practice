/* REMOVE DUPLICATES FROM SORTED ARRAY
Problem:Given a sorted array, remove duplicates in-place such that each element appears only once and return the new length.

Approach: Two Pointer Technique 
        Logic:- Use two pointers:
                    i → points to last unique element
                    j → traverses array
                - If arr[j] != arr[i], move i forward and update arr[i]

Time Complexity: O(n)
Space Complexity: O(1)

*/
import java.util.*;
public class Remove_duplicates {
    public static void main(String[] args)  {
        int []arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
