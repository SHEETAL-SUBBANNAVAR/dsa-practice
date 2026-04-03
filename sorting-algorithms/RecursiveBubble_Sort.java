/*
Problem: Recursive Bubble Sort
Write a program to sort an array using the Recursive Bubble Sort algorithm.

Recursive Bubble Sort works by performing one pass of Bubble Sort 
(recursively moving the largest element to the end), 
and then calling itself for the remaining unsorted part.

Input:
An array of integers.
Output:
A sorted array in ascending order.
- Time Complexity: O(n^2)
- Space Complexity: O(n) (due to recursion)
- Stable: Yes

Steps:
1. Compare adjacent elements from index 0 to n-2.
2. Swap if elements are in the wrong order.
3. After one pass, the largest element moves to the end.
4. Reduce the problem size by 1 (ignore last element).
5. Recursively call the function for remaining elements.
6. Stop when size becomes 1 (base case).

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
public class RecursiveBubble_Sort {
    public static void main(String[] args) {
        int[] arr = {125, 11, 423, 232};

        bubbleSort(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
     public static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);   // the last element is in LAST position, so we can ignore it in the next pass
    }

    
}
