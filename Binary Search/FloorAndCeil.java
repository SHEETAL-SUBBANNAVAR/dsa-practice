/*        FLOOR AND CEIL IN SORTED ARRAY
          ===============================
Problem: Given a sorted array nums and a value X,
         find: - Floor: largest element ≤ X
               - Ceil: smallest element ≥ X

Example: Input: nums = [1, 2, 4, 6, 8], X = 5
         Output: Floor = 4, Ceil = 6

Binary Search
    Logic:- Initialize low = 0, high = n-1
          - Floor:
                If nums[mid] ≤ X → store it and move right
                Else → move left
          - Ceil:
                If nums[mid] ≥ X → store it and move left
                Else → move right
    Advantages:- Efficient O(log n)
               - Works well on sorted arrays
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class FloorAndCeil {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8 };
        int x = 5;
        floorAndCeil(arr, 0, arr.length - 1, x);
    }

    public static void floorAndCeil(int[] arr, int low, int high, int target) {
        int floor = -1;
        int ceil = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if (arr[mid] < target) {
                floor = arr[mid]; 
                low = mid + 1;
            } else {
                ceil = arr[mid]; 
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor + " Ceil: " + ceil);
    }
}
