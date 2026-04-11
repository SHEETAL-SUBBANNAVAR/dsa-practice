/*        SEARCH IN ROTATED SORTED ARRAY - I
         ===================================
Problem: Given a sorted array rotated at an unknown pivot,
         find the index of target element.
         If not found, return -1.
         Array contains distinct elements.
Example: Input: nums = [4,5,6,7,0,1,2], target = 0         Output: 4

Modified Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - While low <= high:
                mid = (low + high) / 2
          - If nums[mid] == target → return mid
          - Check which half is sorted:
                1. Left half sorted (nums[low] <= nums[mid])
                    - If target lies in left half:
                          high = mid - 1
                    - Else:
                          low = mid + 1
                2. Right half sorted
                    - If target lies in right half:
                          low = mid + 1
                    - Else:
                          high = mid - 1
    Advantages:- Efficient search in rotated array
               - Uses binary search concept
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class SearchInRotatedSortedArray {
      public static void main(String[] args) {
            int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
            int target = 0;
            int result = search(arr, target);
            System.out.println(result);
      }

      public static int search(int[] arr, int target) {
            /*
             * for(int i=0;i<arr.length;i++){
             * if(arr[i] == target){
             * return i;
             * }
             * }
             * return -1;
             */
            int high = arr.length - 1;
            int low = 0;
            while (low <= high) {
                  int mid = (low + high) / 2;
                  if (arr[mid] == target) {
                        return mid;
                  }
                  if (arr[low] <= arr[mid]) {
                        if (arr[low] <= target && target < arr[mid]) {
                              high = mid - 1;
                        }

                        else {
                              low = mid + 1;
                        }
                  } else {
                        if (arr[mid] <= target && target <= arr[high])
                              low = mid + 1;
                        else
                              high = mid - 1;
                  }

            }
            return -1;
      }
}
