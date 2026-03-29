/*
Problem: Print Numbers from 1 to N using Recursion
Write a Java program to print numbers from 1 to N using recursion.
Input:
An integer N
Output:
Print numbers from 1 to N in increasing order.

Example:
Input: 5
Output:
1
2
3
4
5
*/
public class Print1ToN {
    public static void main(String[] args) {
        int n = 5;
        print1ton_number(n);
    }

    public static void print1ton_number(int n) {
        if (n == 0) {
            return;
        }
        print1ton_number(n - 1);

        System.out.println(n);
    }
}
