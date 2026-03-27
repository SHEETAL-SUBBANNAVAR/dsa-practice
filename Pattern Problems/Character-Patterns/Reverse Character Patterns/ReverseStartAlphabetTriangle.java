/*  
Problem: Reverse Start Alphabet Triangle Pattern  
Write a Java program to print a triangle pattern where each row starts from a decreasing alphabet and continues till 'E'.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- First row starts with last character (e.g., 'E')
- Each next row starts with previous alphabet
- Each row continues till the last alphabet
Example:
Input: 5
Output:
E
D E
C D E
B C D E
A B C D E
*/
public class ReverseStartAlphabetTriangle {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
