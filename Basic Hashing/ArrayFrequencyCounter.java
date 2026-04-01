/*
Problem: Counting Frequencies of Array Elements  

Write a Java program to count the frequency of each element in a given array.  
The frequency of an element is the number of times it appears in the array.

Input:
An integer array arr of size n.

Output:
Print each element along with its frequency in the array.

Conditions:
- The program should handle arrays with duplicate elements.
- The program should work for both small and large arrays.
- The order of output may vary.

Example:
Input: [1, 2, 2, 3, 1, 4, 2]  
Output:  
1 -> 2  
2 -> 3  
3 -> 1  
4 -> 1  
*/

import java.util.*;

public class ArrayFrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        countFrequencies(arr);
    }

    public static void countFrequencies(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}   