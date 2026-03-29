/*
Problem: Print Numbers from N to 1 using Recursion
Write a Java program to print numbers from N to 1 using recursion.
Input:
An integer N
Output:
Print numbers from N to 1 in decreasing order.

Example:
Input: 5
Output:
5
4
3
2
1
*/
public class PrintNTo1 {
    public static void main(String[] args) {
        int n = 5;
        printNto1_numbers(n);
    }

    public static void printNto1_numbers(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNto1_numbers(n - 1);
    }
}
