/*
Problem: Print All Divisors of a Number  
Write a Java program to print all the divisors of a given integer.
A divisor is a number that divides the given number exactly (no remainder).
Input:
An integer n.
Output:
Print all divisors of n.
Conditions:
- The number should be positive.
- Divisors should be printed in increasing order.

Example:
Input: 12  
Output: 1 2 3 4 6 12  
Input: 7  
Output: 1 7  
*/

import java.util.*;

public class PrintAllDivisors {
   public static void main(String[] args) {
//         int n=12;
//         int original =n;
//        Stack<Integer> st = new Stack<>();
//        for(int i=1;i<=n;i++){
//         if(n%i ==0){
//             st.push(i);
//         }
//     }
//     System.out.println(st);
            
//         }
// }
 int n = 12;
        printDivisors(n);
    }

    public static void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");

                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }

}