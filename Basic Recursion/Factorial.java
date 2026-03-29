/*
Problem: Factorial of a Given Number using Recursion
Write a Java program to find the factorial of a given number using recursion.
Input:
An integer N
Output:
Return/Print the factorial of N.

Example:
Input: 5
Output:
120
Explanation:
5! = 5 × 4 × 3 × 2 × 1 = 120
*/
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n ==0 || n==1 ){
            return 1;
        }
        return (n * factorial(n - 1));

    }
}
