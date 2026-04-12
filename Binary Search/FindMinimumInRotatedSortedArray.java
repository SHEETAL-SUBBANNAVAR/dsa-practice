/*        FIND MINIMUM IN ROTATED SORTED ARRAY
        =====================================

Problem: Given a sorted array that is rotated at an unknown pivot,find the minimum element.Array contains distinct elements.
Example: Input: nums = [4,5,6,7,0,1,2]         Output: 0
Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - While low < high:
                mid = (low + high) / 2
          - If nums[mid] > nums[high]:
                Minimum lies in right half
                → low = mid + 1
          - Else:
                Minimum lies in left half (including mid)
                → high = mid
          - Finally, nums[low] is the minimum element
    Key Idea:- Compare mid with high to decide the unsorted part
    Advantages:- Efficient O(log n)
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 }; // o/p =0
        find(arr, 0, arr.length - 1);
    }

    public static void find(int[] arr, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(arr[low]);
    }
}