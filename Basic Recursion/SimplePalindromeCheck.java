/*
Problem: Check if a String is Palindrome using Recursion
Write a Java program to check whether a given string is a palindrome using recursion.

Input:
A string
Output:
Return/Print true if palindrome, else false

Example:
Input: "madam"
Output:
true
Explanation:
A palindrome reads the same forward and backward.
*/
public class SimplePalindromeCheck {
    public static void main(String[] args) {
        //String name = "madam";
        String name = "Anurag";
       boolean result = palindrome(name, 0, name.length() - 1);
        System.out.println(result);
    }

    public static boolean palindrome(String name, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (name.charAt(left) != name.charAt(right)) {
            return false;
        }
        return palindrome(name, left + 1, right - 1);
    }
}


     