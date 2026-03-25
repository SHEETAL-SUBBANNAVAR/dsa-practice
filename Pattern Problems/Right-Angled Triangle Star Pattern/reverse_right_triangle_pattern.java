/*         Problem: Reverse Right-Angled Star Triangle Pattern  
Write a Java program to print a reverse right-angled triangle pattern using stars (*).
Input:
An integer n representing number of rows.
Output:
A triangle where:
- Row 1 contains n stars
- Row 2 contains (n-1) stars
- Row 3 contains (n-2) stars
- And so on...
- Last row contains 1 star
Example:
Input: 5
Output:
*****
****
***
**
*

*/
public class reverse_right_triangle_pattern {
    public static void main(String[] args) {
        int n=5;
        reverse_right_triangle(n);
    }
    public static void reverse_right_triangle(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
