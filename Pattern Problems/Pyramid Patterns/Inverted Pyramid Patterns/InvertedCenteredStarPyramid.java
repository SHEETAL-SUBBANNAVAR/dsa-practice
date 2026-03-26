/*  
Problem: Inverted Centered Star Pyramid Pattern  

Write a Java program to print an inverted centered pyramid using stars (*).

Input:
An integer n representing number of rows.

Output:
A pyramid where:
- First row contains (2*n - 1) stars
- Each next row decreases stars by 2
- Stars are centered using spaces
- Last row contains 1 star

Example:
Input: 5

Output:
*********
 *******
  *****
   ***
    *
*/
class InvertedCenteredStarPyramid {
    public static void main(String[] args) {
        int n =5;
        InvertedStarPyramid(n);
    }

    public static void InvertedStarPyramid(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j< 2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
