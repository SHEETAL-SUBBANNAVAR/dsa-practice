/*
Problem: Check if the Number is Armstrong  
Write a Java program to check whether a given number is an Armstrong number.
An Armstrong number is a number that is equal to the sum of its digits 
each raised to the power of the number of digits.
Input:
An integer n.
Output:
Print "Armstrong" if the number is an Armstrong number,
otherwise print "Not Armstrong".
Conditions:
- The program should handle non-negative integers.
- If the number is 0, it is considered an Armstrong number.

Example:
Input: 153  
Output: Armstrong  
(1^3 + 5^3 + 3^3 = 153)
Input: 123  
Output: Not Armstrong  
Input: 0  
Output: Armstrong  
*/

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(n+": "+armstrong(n));

    }

    public static String armstrong(int n) {
        int original = n;

        int digits = 0;
        if (original == 0) {
            digits++;
        } else {
            while (n > 0) {
                digits++;
                n /= 10;
            }
        }
        int temp = original;
        // System.out.println(digits);
        int sum = 0;
        while (temp > 0) {
            int lastval = temp % 10;
            sum += Math.pow(lastval, digits);
            temp /= 10;
        }
        return (sum == original ? "Armstrong " : "Not Armstrong  ");

    }
}