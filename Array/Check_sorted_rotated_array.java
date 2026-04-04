/*     CHECK IF ARRAY IS SORTED AND ROTAT
    problem:Check whether a given array is sorted in non-decreasing order and possibly rotated.
  
Approach: Circular Tra versal (Mo dulo Trick)
        Logic:- Traverse the array from index 0 to n-1
        - Compare each element with the next element using:
            arr[i] > arr[(i + 1) % n
        - The modulo (%) ensures cir
     

        - Count how many times the order is violated

Condition:- If violation count <= 1 → array is sorted and rotated
          - If violation count > 1 → not valid
Example:Input: [3, 4, 5, 1, 2]
Comparisons:
3 → 4 
4 → 5 
5 → 1  (violation)
1 → 2 
2 → 3 


Time Complexity: O(n)
Space Complexity: O(1)

*/
import java.util.Arrays;
class Check_sorted_rotated_array {   
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        boolean result1 = checkSortedRotated(arr1);
        boolean result2 = checkSortedRotated(arr2);
        System.out.println(result1); 
        System.out.println(result2); 
    }
    public static boolean checkSortedRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    
}