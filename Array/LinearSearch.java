/*                LINEAR SEARCH
             ======================
Problem:Search for a target element in an array by checking each element one by one.

Example:Input:  arr = [10, 20, 30, 40], target = 30
            Output: Found at index 2

Approach: Sequential Traversal
        Logic:- Start from index 0
              - Compare each element with target
              - If match found → return index
              - If not found till end → return -1
Time Complexity:- Best Case: O(1) (element found at first position)
                - Worst Case: O(n) (element at last or not present)
                - Space Complexity: O(1)

Advantages:- Simple and easy to implement
           - Works on unsorted arrays
Disadvantages:- Slow for large datasets
*/
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int target = 30;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
