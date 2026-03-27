/*  
Problem: Butterfly Star Pattern  

Write a Java program to print a butterfly pattern using stars (*).

Input:
An integer n representing half of the pattern height.

Output:
A pattern where:
- First half: stars increase, spaces decrease
- Second half: stars decrease, spaces increase
- Pattern is symmetric (like butterfly wings)

Example:
Input: 5

Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
public class ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
