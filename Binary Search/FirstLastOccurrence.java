/*       FIRST AND LAST OCCURRENCE IN SORTED ARRAY
         ==========================================
Problem: Given a sorted array nums and a value X,
         find the first (leftmost) and last (rightmost) occurrence of X.
         If X is not present, return [-1, -1].
Example: Input: nums = [1, 2, 2, 2, 3, 4], X = 2         Output: [1, 3]

Binary Search (Using Lower Bound & Upper Bound)
    Logic:- First Occurrence:
                Find first index where nums[i] == X
                (Use Lower Bound: first ≥ X)
          - Last Occurrence:
                Find last index where nums[i] == X
                (Use Upper Bound: first > X, then subtract 1)
          - If element not found → return [-1, -1]
    Advantages:- Efficient and fast
               - Works in logarithmic time
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class FirstLastOccurrence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4 };
        int x = 2; // Output: [1, 3]
        int first = firstOccurrence(arr, 0, arr.length-1, x);
        int last = lastOccurrence(arr, 0, arr.length-1, x);
        System.out.println("First = " + first + " Last = " + last);
    }

    //for first
    public static int firstOccurrence(int[] arr, int low, int high, int x) {
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return first;
    }
    //for last
    public static int lastOccurrence(int[] arr, int low, int high, int x) {
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;

            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return last;
    }
}
