/*          Problem: Repeated Number Right-Angled Triangle Pattern  
Write a Java program to print a right-angled triangle pattern where each row contains the same number repeated.

Input:
An integer n representing number of rows.
Output:
A triangle where:
- Row 1 contains one '1'
- Row 2 contains two '2's
- Row 3 contains three '3's
- And so on...
Example:
Input: 5
Output:
1
22
333
4444
55555
*/
public class RepeatedNumberTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
