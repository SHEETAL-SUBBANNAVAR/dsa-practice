/*
Problem: Bubble Sort
Write a program to sort an array using the Bubble Sort algorithm.

Bubble Sort works by repeatedly comparing adjacent elements 
and swapping them if they are in the wrong order.

Input:
An array of integers.
Output:
A sorted array in ascending order.

- Time Complexity is O(n^2) in worst and average cases.
- Best Case is O(n) when array is already sorted (optimized version).

Steps:
1. Start from the first element.
2. Compare the current element with the next element.
3. If the current element is greater, swap them.
4. Move to the next pair of elements.
5. After one complete pass, the largest element moves to the end.
6. Repeat the process for remaining elements.
7. Stop early if no swaps are made in a pass.

Example:
Input: [5, 1, 4, 2]

Step 1 (Pass 1):
Compare 5 and 1 → swap → [1, 5, 4, 2]
Compare 5 and 4 → swap → [1, 4, 5, 2]
Compare 5 and 2 → swap → [1, 4, 2, 5]

Step 2 (Pass 2):
Compare 1 and 4 → no swap → [1, 4, 2, 5]
Compare 4 and 2 → swap → [1, 2, 4, 5]

Step 3 (Pass 3):
Compare 1 and 2 → no swap → [1, 2, 4, 5]

Output:
[1, 2, 4, 5]
*/
public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 13, 4, 10, 2, 9 };
        int n = arr.length;
        bubble_sort(arr, n);
    }

    public static void bubble_sort(int[] arr, int num) {
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
          //System.out.print(arr[i] + " ");

        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
