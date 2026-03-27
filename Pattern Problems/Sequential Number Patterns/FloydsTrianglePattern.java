/*  
Problem: Floyd’s Triangle Pattern  
Write a Java program to print a triangle pattern with continuous numbers.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- Numbers increase continuously across rows
- Each row contains increasing count of numbers
Example:
Input: 5
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
public class FloydsTrianglePattern {
    public static void main(String[] args) {
        int n=5; 
        int num=1;
        for(int i=1;i<=n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
