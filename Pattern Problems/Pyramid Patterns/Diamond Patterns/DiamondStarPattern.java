/*  
Problem: Diamond Star Pattern  

Write a Java program to print a diamond shape using stars (*).

Input:
An integer n representing number of rows (upper half).

Output:
A diamond where:
- First half is a centered pyramid (1, 3, 5, ...)
- Second half is an inverted pyramid
- Total rows = (2*n - 1)

Example:
Input: 5

Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
public class DiamondStarPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
            
            
        }for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j< 2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
