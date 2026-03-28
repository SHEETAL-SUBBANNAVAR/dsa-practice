/*  
Problem: Count All Digits of a Number  
Write a Java program to count the number of digits in a given integer.
Input:
An integer n.
Output:
Print the total number of digits present in the number.
Conditions:
- If the number is 0, the output should be 1.
- The solution should work for any non-negative integer.
Example:
Input: 123361212  
Output: 9  
Input: 1233  
Output: 4  
Input: 0  
Output: 1  
*/
public class CountallDigitsofaNumber {
    public static void main(String[] args) {
        int n = 123361212;
        countDigits(n);
        int l = 1233;
        countDigits(l);
        int z = 0;
        countDigits(z);

    }

    public static void countDigits(int n) {
        // Basic Method 
        int count = 0;
        if (n == 0) {
            count++;
            System.out.println(count);
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
            System.out.println(count);
        }
        // Convert number to string and count length
        //  count = String.valueOf(n).length();
        //  System.out.println(count);
    }
}