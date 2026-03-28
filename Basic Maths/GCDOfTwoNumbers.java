
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
import java.util.Scanner;

 public class GCDOfTwoNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("  Enter 1st number :");
//         int a = sc.nextInt(); // Integer input int num = sc.nextInt();
//         System.out.print(" \n enter 2nd number : ");
//         int b = sc.nextInt(); // String input (single word) String word = sc.next();
//         gcdval(a, b); // String input (full line) String line = sc.nextLine();

//     }

//     public static void gcdval(int a, int b) {

//         int x = Math.max(a, b);
//         System.out.println(" GCD of " + a + "and " + b + " Numbers:");
//         for (int i = 1; i <= x; i++) {
//             if (a % i == 0 && b % i == 0) {

//                 System.out.println(i);
//             }
//         }
//         System.out.println();
//     }
// Continue loop as long as both
    // a and b are greater than 0
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

