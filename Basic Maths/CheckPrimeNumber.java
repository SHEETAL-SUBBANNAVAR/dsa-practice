/*
Problem: Check for Prime Number  
Write a Java program to check whether a given number is a prime number.
A prime number is a number greater than 1 that has only two divisors: 1 and itself.
Input:
An integer n.
Output:
Print "Prime" if the number is prime, otherwise print "Not Prime".
Conditions:
- Numbers less than or equal to 1 are not prime.
- The program should efficiently check for primality.

Example:
Input: 7  
Output: Prime  
Input: 10  
Output: Not Prime  
Input: 1  
Output: Not Prime  
*/
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        primeNumber(n);
        int l = 10;
        primeNumber(l);
        int a = 1;
        primeNumber(a);
    }

    public static void primeNumber(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}
