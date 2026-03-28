/*
Problem: Reverse a Number  
Write a Java program to reverse the digits of a given integer.
Input:
An integer n.
Output:
Print the reversed number.
Conditions:
- The program should handle positive integers.
- If the number is 0, output should be 0.
- Do not use built-in reverse functions.
Example:
Input: 1234  
Output: 4321  
Input: 1200  
Output: 21  
Input: 0  
Output: 0  
*/
class ReverseNumber {
    public static void main(String[] args) {
        int n = 123;
        reverseNumber(n);
        int l = -1222;
        reverseNumber(l);
        int z = 978867;
        reverseNumber(z);
    }

    public static void reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && rem > 7)) {   //Integer.MAX_VALUE = 2147483647
                System.out.println(0);
                return;
            }
            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && rem < -8)) { //Integer.MIN_VALUE = -2147483648
                System.out.println(0);
                return;
            }
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
