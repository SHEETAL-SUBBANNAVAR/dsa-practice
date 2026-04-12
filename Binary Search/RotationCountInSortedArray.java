/*        FIND ROTATION COUNT IN SORTED ARRAY
         ====================================
Problem: Given a sorted array that is rotated at an unknown pivot,
         find how many times the array is rotated.
         Rotation count = index of minimum element

Example: Input: nums = [4,5,6,7,0,1,2]        Output: 4
         (Array rotated 4 times)

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
          - Finally, low gives index of minimum element
          - Return low as rotation count
    Key Idea:- Rotation count = index of minimum element
    Advantages:- Efficient O(log n)
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class RotationCountInSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 4, 5, 6, 7, 0, 1, 2 }; // Output: 4
        int arr2[] = { 4, 5, 6, 7, 8, 1, 2 };// Output: 5
        int result1 = rotation(arr1, 0, arr1.length - 1);
        int result2 = rotation(arr2, 0, arr2.length - 1);
        System.out.println("Array (1) rotated " + result1 + " times");
        System.out.println("Array (2) rotated " + result2 + " times");
    }

    public static int rotation(int[] arr, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
