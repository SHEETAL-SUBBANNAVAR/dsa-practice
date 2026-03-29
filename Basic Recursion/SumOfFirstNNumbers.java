/*
Problem: Sum of First N Natural Numbers using Recursion
Write a Java program to find the sum of first N natural numbers using recursion.
Input:
An integer N
Output:
Return/Print the sum of first N natural numbers.

Example:
Input: 5
Output:
15
Explanation:
1 + 2 + 3 + 4 + 5 = 15
*/
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n=5;
        int result = sum(n);
        System.out.println(result);
    }
    public static int sum(int n) {
        
        if(n==0){
            return 0;   
        }
        return n + sum(n - 1);

    }
}
