/*        SEARCH X IN SORTED ARRAY
        =========================

Problem: Given a sorted array nums and a target value X, return the index of X if found. If not found, return -1.
Example: Input: nums = [1, 3, 5, 7, 9], X = 5         Output: 2
Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - Find mid = (low + high) / 2
          - If nums[mid] == X → return mid
          - If nums[mid] < X → search right half
          - If nums[mid] > X → search left half
          - Repeat until found or low > high
    Advantages:- Very fast for sorted arrays
               - Reduces search space by half each step
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 12 };
        int x = 9;
        int result = search(arr, 0, arr.length - 1, x);
        System.out.println("the element present at index : " + result);
    }

    public static int search(int[] arr, int low, int high, int x) {

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid; 
            } else if (arr[mid] > x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
