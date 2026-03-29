/*
Problem: Valid Palindrome using Recursion
Write a Java program to check whether a given string is a palindrome.
Ignore non-alphanumeric characters and consider case-insensitive comparison.
Input:
A string s
Output:
Return true if the string is a palindrome, else false

Example:
Input: "A man, a plan, a canal: Panama"
Output: true
Explanation:
After removing non-alphanumeric characters and converting to lowercase:
"amanaplanacanalpanama" → palindrome
*/
public class ValidPalindrome {
    public static void main(String[] args) {
        //String name = "race a car";  //false
        String name = "A man, a plan, a canal: Panama";
         boolean result = isPalindrome(name);
   
        System.out.println(result);
    }

public static boolean isPalindrome(String s) {
       return check(s, 0, s.length() - 1);   
    }
    public static boolean check(String s ,int left,int right){
         while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {   // for space 
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        if (left >= right) {
            return true;
        }
        if (Character.toLowerCase(s.charAt(left)) != 
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }
       return check(s,left+1,right-1);
    }
}

