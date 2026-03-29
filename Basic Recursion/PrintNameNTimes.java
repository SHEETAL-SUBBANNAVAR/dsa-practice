/*
Problem: Print Name N Times Using Recursion
Write a Java program to print a given name N times using recursion.
Input:
An integer N (number of times)
A string (name to print)
Output:
Print the given name N times, each on a new line.

Example:
Input:
N = 3
Name = Alex
Output:
Alex
Alex
Alex
*/
public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 5;
        String name = "Alex";
        printNameNTimes(n, name);
    }

    public static void printNameNTimes(int n, String name) {
        if (n == 0) {
            return;
        }
        System.out.println(name);

        printNameNTimes(n - 1, name);

    }
}
