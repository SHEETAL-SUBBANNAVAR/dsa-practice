/*  
Problem: Mirror Number Triangle Pattern  
Write a Java program to print a mirrored number triangle pattern.
Input:
An integer n representing number of rows.
Output:
A pattern where:
- Left side prints numbers from 1 to row number
- Right side prints numbers from row number to 1
- Spaces are maintained between two parts
- Both sides grow with each row

Example:
Input: 4
Output:
1      1
12    21
123  321
12344321
*/
public class MirrorNumberTriangle {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i; j <= 2 * n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
