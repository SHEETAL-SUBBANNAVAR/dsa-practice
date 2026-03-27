/*  
Problem: Palindrome Alphabet Pyramid Pattern  

Write a Java program to print a pyramid pattern where alphabets form a palindrome in each row.

Input:
An integer n representing number of rows.

Output:
A pyramid where:
- Left side increases from 'A' to a peak character
- Right side decreases back to 'A'
- Pattern is centered using spaces

Example:
Input: 4

Output:
   A
  ABA
 ABCBA
ABCDCBA
*/
public class PalindromeAlphabetPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 1; j >= 0; j--) {

                System.out.print((char) ('A' + j));
                ;
            }

            System.out.println();
        }
    }
}
