/*  
Problem: Hollow Square Star Pattern  
Write a Java program to print a hollow square using stars (*).
Input:
An integer n representing size of square.
Output:
A square where:
- First and last rows are filled with stars
- First and last columns are stars
- Inner area is empty (spaces)
Example:
Input: 4

Output:
****
*  *
*  *
****
*/
public class HollowSquarePattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                if (i == 0 || j == 0 || j == n-1 || i == n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
