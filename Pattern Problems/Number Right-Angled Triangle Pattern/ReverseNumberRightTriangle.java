/*                     Problem: Reverse Number Right-Angled Triangle Pattern  
Write a Java program to print a reverse right-angled triangle pattern using numbers.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- Row 1 contains numbers from 1 to n
- Row 2 contains numbers from 1 to (n-1)
- Row 3 contains numbers from 1 to (n-2)
- And so on...
- Last row contains only '1'
Example:
Input: 5
Output:
12345
1234
123
12
1
*/
public class ReverseNumberRightTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=0;i--){
            for(int j=0 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
