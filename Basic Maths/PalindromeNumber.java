/*
Problem: Palindrome Number  
Write a Java program to check whether a given integer is a palindrome.
A number is called a palindrome if it reads the same forward and backward.
Input:
An integer n.
Output:
Return true if the number is a palindrome, otherwise return false.
Example:
Input: 121  
Output: true  
Input: 123  
Output: false  
*/
public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        System.out.println(palindromeNumber(n));
        int l=-121;
        System.out.println(palindromeNumber(l));
        int z=0;
        System.out.println(palindromeNumber(z));
    }
    public static boolean  palindromeNumber(int n){
        int x= n;
        int rev=0;
        while(n>0){
            int val =n%10;
            n/=10;
            rev=rev*10+val;
        }
        return (x == rev );
    }
}
