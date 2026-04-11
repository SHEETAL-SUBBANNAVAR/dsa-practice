/*        SEARCH IN ROTATED SORTED ARRAY - II
         ====================================
Problem: Given a rotated sorted array (with duplicates),check if target exists in the array.
         Return true if found, else false.
Example: Input: nums = [2,5,6,0,0,1,2], target = 0         Output: true

Modified Binary Search (Handling Duplicates)
    Logic:- Initialize low = 0, high = n-1
          - While low <= high:
                mid = (low + high) / 2
          - If nums[mid] == target → return true
          - Handle duplicates:
                If nums[low] == nums[mid] == nums[high]
                → increment low and decrement high
          - Else check sorted half:
                1. Left half sorted (nums[low] <= nums[mid])
                    - If target lies in this range:
                          high = mid - 1
                    - Else:
                          low = mid + 1
                2. Right half sorted
                    - If target lies in this range:
                          low = mid + 1
                    - Else:
                          high = mid - 1
    Key Difference from Part I:
          - Duplicates make it hard to identify sorted half
          - So we shrink search space when equal elements

    Advantages:- Works even with duplicates
               - Reduces unnecessary comparisons

    Time Complexity: O(log n) (average)
                     O(n) (worst case due to duplicates)
    Space Complexity: O(1)

Edge Cases:- All elements same
           - Target not present
           - Single element array
           - Multiple duplicates at boundaries
*/
public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 2; // o/p=true
        int result = search(arr, 0, arr.length - 1, target);
        System.out.println((result == 1 ? "True" : "False"));
    }

    public static int search(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return 1;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
