/*  
Problem: Symmetric Butterfly Star Pattern  

Write a Java program to print a symmetric butterfly pattern using stars (*).

Input:
An integer n representing half of the butterfly height.

Output:
A pattern where:
- Upper half: stars decrease then increase
- Lower half: stars increase then decrease
- Spaces adjust dynamically to maintain symmetry
- Pattern resembles butterfly wings

Example:
Input: 5

Output:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

public class SymmetricButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }     
            
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
