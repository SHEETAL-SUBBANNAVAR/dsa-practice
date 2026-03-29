/*
Problem: Find Fibonacci Number using Recursion
Write a Java program to find the Nth Fibonacci number using recursion.
Input:
An integer N

Output:
Return/Print the Nth Fibonacci number.
Example:
Input: 5
Output:
5

Explanation:
Fibonacci series:
0, 1, 1, 2, 3, 5...
*/
public class Fibonacci {
    public static boolean isFibonacci(int a, int b, int n) {
        if (n == a || n == b) return true;
        if (b > n) return false;
        return isFibonacci(b, a + b, n);
    }

    public static void main(String[] args) {
        int n = 5;
        // int n = 25;  NOT Fibonacci

        if (isFibonacci(0, 1, n)) {
            System.out.println(n + " is Fibonacci");
        } else {
            System.out.println(n + " is NOT Fibonacci");
        }
    }
}
