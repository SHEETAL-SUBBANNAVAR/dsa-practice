/*           UNION OF TWO SORTED ARRAYS
          ================================

Problem:Given two sorted arrays, return the union of both arrays.
        The union contains all unique elements from both arrays.

Example:Input:arr1 = [1, 2, 3, 4] arr2 = [2, 3, 5, 6]
Output:[1, 2, 3, 4, 5, 6]

Approach 1: Brute Force (Using Set)
    Logic:- Add all elements of both arrays into a Set
          - Convert set to array/list
    Time Complexity: O(n + m)
    Space Complexity: O(n + m)

Approach 2: Two Pointer Technique (Optimal)
    Logic:- Use two pointers i and j for arr1 and arr2 
          - Compare elements:- If equal → add once, move both pointers
                       - If smaller → add and move that pointer
          - After loop, add remaining elements
          - Avoid duplicates while adding
    Advantages:- Efficient for sorted arrays
               - Maintains sorted order
                - No extra sorting required
    Time Complexity: O(n + m)
    Space Complexity: O(1) (excluding output)
Edge Cases:- One array empty
           - Both arrays empty
           - All elements same
           - No common elements
*/

import java.util.HashMap;
import java.util.HashSet;

public class Union_of_two_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 3, 5, 6 };
        union(arr1, arr2);
        
    }
    /*  public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        for(int num : set){
        System.out.print(num + " ");
    }
    
        
     }*/
}
