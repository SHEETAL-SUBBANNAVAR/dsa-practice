/*  
            Problem: Right-Angled Triangle Star Pattern
  Description:
        Write a Java program to print a right-angled triangle pattern using stars (*).
  Input:
        An integer n representing number of rows.
  Output: 
         A right-angled triangle with n rows.

Example:
Input: 5

Output:
*
* *
* * *
* * * *
* * * * *
Approach:

Prints a triangle using nested loops
 Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class RightAngledTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to print a larger or smaller triangle
        RightAngledTriangle(n);
    }

    public static void RightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}