/*  
Problem: Symmetric Increasing-Decreasing Star Triangle  
Write a Java program to print a symmetric triangle pattern using stars (*).
Input:
An integer n representing the peak number of stars.
Output:
A pattern where:
- Stars increase from 1 to n
- Then decrease back to 1
- Total rows = (2*n - 1)
Example:
Input: 5

Output:
*
**
***
****
*****
****
***
**
*
*/
 class SymmetricStarTriangle {
    public static void main(String[] args) {
        int n =5;
         symmetricTriangle(n);
    }
    public static void symmetricTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
