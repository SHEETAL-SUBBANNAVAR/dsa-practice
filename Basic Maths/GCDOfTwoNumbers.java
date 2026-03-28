
/*
Problem: Find GCD of Two Numbers  
Write a Java program to find the Greatest Common Divisor (GCD) of two integers.
The GCD of two numbers is the largest number that divides both numbers exactly.
Input:
Two integers a and b.
Output:
Print the GCD of the given numbers.
Conditions:
- Both numbers should be non-negative.
- If one number is 0, GCD is the other number.

Example:
Input: a = 12, b = 18  
Output: 6  
Input: a = 20, b = 8  
Output: 4  
Input: a = 0, b = 5  
Output: 5  
*/


 public class GCDOfTwoNumbers {
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
           
            if(a > b) { 
                a = a % b;
            }
            else {
                b = b % a;
            }
         
        }
        
        if(a == 0) {
            return b;
        }
       
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        int gcd = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

