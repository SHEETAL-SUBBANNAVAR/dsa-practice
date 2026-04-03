/*
Problem: Recursive Insertion Sort
Write a program to sort an array using the Recursive Insertion Sort algorithm.

Recursive Insertion Sort works by recursively sorting the first n-1 elements,
and then inserting the nth element into its correct position.

Input:
An array of integers.
Output:
A sorted array in ascending order.

- Time Complexity:
  Worst Case: O(n^2)
  Average Case: O(n^2)
  Best Case: O(n)

- Space Complexity: O(n) (due to recursion)
- Stable: Yes

Steps:
1. Assume the first element is already sorted.
2. Recursively sort the first n-1 elements.
3. Take the last element (key).
4. Compare it with elements in the sorted part.
5. Shift elements that are greater than key.
6. Insert key at correct position.
7. Repeat until the entire array is sorted.

Example:
Input: [12, 11, 13, 5, 6]
Step 1:
Sort first 1 element → [12]
Step 2:
Insert 11 → shift 12 → [11, 12]
Step 3:
Insert 13 → no change → [11, 12, 13]
Step 4:
Insert 5 → shift 13,12,11 → [5, 11, 12, 13]
Step 5:
Insert 6 → shift 13,12,11 → [5, 6, 11, 12, 13]
Output:
[5, 6, 11, 12, 13]
*/
public class RecursiveInsertion_Sort {
    public static void main(String[] args) {
        int []arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        insertion_sort(arr,n);
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
    public static void insertion_sort(int [] arr ,int n){
        if(n<=1) return;
        insertion_sort(arr, n-1);
        int j = n-1;
        while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        
    }
}
