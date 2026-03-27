/*  
Problem: Binary Number Triangle Pattern  

Write a Java program to print a triangle pattern using binary numbers (0 and 1).

Input:
An integer n representing number of rows.

Output:
A triangle where:
- Each row contains alternating 1s and 0s
- First row starts with 1
- Pattern alternates based on position

Example:
Input: 5

Output:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
public class BinaryTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
