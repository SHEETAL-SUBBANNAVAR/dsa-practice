/*  
Problem: Reverse Alphabet Triangle Pattern  
Write a Java program to print a reverse triangle pattern using alphabets.
Input:
An integer n representing number of rows.
Output:
A triangle where:
- First row prints alphabets from 'A' to the nth character
- Each next row removes the last character
- Last row prints only 'A'

Example:
Input: 5
Output:
ABCDE
ABCD
ABC
AB
A
*/
public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i = n ;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
