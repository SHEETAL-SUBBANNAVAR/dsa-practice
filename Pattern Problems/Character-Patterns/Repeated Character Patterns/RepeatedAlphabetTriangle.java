/*  
Problem: Repeated Alphabet Triangle Pattern  
Write a Java program to print a triangle pattern where each row contains the same alphabet repeated.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- Row 1 contains 'A'
- Row 2 contains 'B' repeated twice
- Row 3 contains 'C' repeated three times
- And so on...
Example:
Input: 5
Output:
A
BB
CCC
DDDD
EEEEE
*/
public class RepeatedAlphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
        
    }
}
