/*
Problem: Reverse an Array using Recursion
Write a Java program to reverse a given array using recursion.
Input:
An array of integers
Output:
The array should be reversed in-place.

Example:
Input: [1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
*/
public class ReverseArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        reverseArray(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void reverseArray(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        reverseArray(array, left + 1, right - 1);
    }
}