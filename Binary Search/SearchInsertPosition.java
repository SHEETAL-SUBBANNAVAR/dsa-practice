/*        SEARCH INSERT POSITION
          =======================
Problem: Given a sorted array nums and a target X,
         return the index if the target is found.
         If not, return the index where it would be inserted
         to maintain sorted order.

Example: Input: nums = [1, 3, 5, 6], X = 5
         Output: 2
         Input: nums = [1, 3, 5, 6], X = 2
         Output: 1

Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - While low <= high:
                mid = (low + high) / 2
                If nums[mid] == X → return mid
                If nums[mid] < X → move right (low = mid + 1)
                Else → move left (high = mid - 1)
          - If not found → return low (insert position)

    Key Idea:- Insert position = Lower Bound of X
    Advantages:- Efficient and fast
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 6 };
        int x1 = 5; // Output: 2
        int arr2[] = { 1, 3, 5, 6 };
        int x2 = 2; // Output: 2
        int result1 = search(arr1, 0, arr1.length, x1);
        System.out.println("the position is : " + result1);
        int result2 = search(arr2, 0, arr2.length, x2);
        System.out.println("the position is : " + result2);
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
