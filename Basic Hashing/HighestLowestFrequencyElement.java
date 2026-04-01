/*
Problem: Highest and Lowest Occurring Elements in an Array  

Write a Java program to find the element with the highest frequency 
and the element with the lowest frequency in a given array.

Input:
An integer array arr of size n.

Output:
Print two elements:
1. Element with highest frequency
2. Element with lowest frequency

Conditions:
- The array may contain duplicate elements.
- If multiple elements have same frequency, return any one.

Example:
Input: [10,5,10,15,10,5]  
Output: 10 15  

Input: [2,2,3,4,4,2]  
Output: 2 3  
*/
import java.util.*;
    public class HighestLowestFrequencyElement {

    public static void main(String[] args) {

        int[] arr = {10, 5, 10, 15, 10, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = -1;
        int minElement = -1;

  
        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }

        System.out.println(maxElement + " " + minElement);
    }
}

