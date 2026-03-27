/*  
Problem: Concentric Square Number Pattern  

Write a Java program to print a square pattern with concentric layers of numbers.

Input:
An integer n representing the center value.

Output:
A square of size (2*n - 1) where:
- Outer layer contains n
- Next inner layer contains (n-1)
- Continues until center reaches 1
- Pattern is symmetric in all directions

Example:
Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
public class ConcentricSquarePattern {
    public static void main(String[] args) {
        int n=4;
        
                  for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print number (starts with n at border, decreases inside)
                System.out.print((n - minDist) + " ");
                
            }
            System.out.println();
        }

    }
}
