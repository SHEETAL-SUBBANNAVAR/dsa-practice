/*
Problem: Insertion Sort
Write a program to sort an array using the Insertion Sort algorithm.
Insertion Sort works by taking one element at a time 
and placing it in its correct position in the sorted part of the array.

Input:
An array of integers.
Output:
A sorted array in ascending order.

- Time Complexity:
  Worst Case: O(n^2)
  Average Case: O(n^2)
  Best Case: O(n) (when already sorted)

Steps:
1. Start from the second element (index 1).
2. Assume the first element is already sorted.
3. Pick the current element (key).
4. Compare it with elements in the sorted part (left side).
5. Shift all elements that are greater than key to one position ahead.
6. Insert the key at its correct position.
7. Repeat for all elements until the array is sorted.

Example:
Input: [12, 11, 13, 5, 6]
Step 1:
Key = 11
Compare with 12 → shift 12
Insert 11 → [11, 12, 13, 5, 6]

Step 2:
Key = 13
Compare with 12 → no change
[11, 12, 13, 5, 6]

Step 3:
Key = 5
Compare with 13 → shift
Compare with 12 → shift
Compare with 11 → shift
Insert 5 → [5, 11, 12, 13, 6]

Step 4:
Key = 6
Compare with 13 → shift
Compare with 12 → shift
Compare with 11 → shift
Insert 6 → [5, 6, 11, 12, 13]

Output:
[5, 6, 11, 12, 13]
*/
public class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 30, 5, 3, 11 };
        int n = arr.length;
        insertion_Sorting(arr, n);

    }

    public static void insertion_Sorting(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
