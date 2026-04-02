/*
Problem: Selection Sort
Write a program to sort an array using the Selection Sort algorithm.

Selection Sort works by repeatedly finding the minimum element 
from the unsorted part of the array and placing it at the beginning.

Input:
An array of integers.
Output:
A sorted array in ascending order.

- Time Complexity is O(n^2) for all cases.

Steps:
1. Start from the first index (i = 0).
2. Assume the current index has the minimum value.
3. Compare this element with the rest of the array.
4. Find the actual minimum element in the remaining array.
5. Swap the minimum element with the current index.
6. Move to the next index and repeat the process.
7. Continue until the entire array is sorted.

Example:
Input: [64, 25, 12, 22, 11]

Step 1:
Find minimum from entire array → 11
Swap with first element
[11, 25, 12, 22, 64]

Step 2:
Find minimum from remaining array → 12
Swap with second element
[11, 12, 25, 22, 64]

Step 3:
Find minimum → 22
Swap
[11, 12, 22, 25, 64]

Step 4:
Find minimum → 25
No change needed

Output:
[11, 12, 22, 25, 64]
*/

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 22, 11, 33, 14, 20 };
        int n = arr.length;
        System.out.println(n);
        selection_sort(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selection_sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; 

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}