/*  
Problem: Alphabet Triangle Pattern  
Write a Java program to print a triangle pattern using alphabets.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- Each row prints alphabets starting from 'A'
- Number of characters increases with each row

Example:
Input: 5
Output:
A
AB
ABC
ABCD
ABCDE
*/
public class AlphabetTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));

            }
            System.out.println();
        }
    }
}
