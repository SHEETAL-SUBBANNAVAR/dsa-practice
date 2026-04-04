/*            SECOND LARGEST ELEMENT IN AN ARRAY
       ==========================================================
Problem:Find the second largest element in a given array.

Approach 1: Sorting (Simple but not optimal)
        Logic:- Sort the array
             - Traverse from end and find the first element smaller than largest
        Time Complexity: O(n log n)
        Space Complexity: O(1)

Approach 2: Two Variables (Optimal Approach)
        Logic:- Maintain two variables: largest and secondLargest
              - Traverse array once
              - Update both accordingly
        Advantages:- Efficient
              - Works for all cases
        Time Complexity: O(n)
        Space Complexity: O(1)

Conclusion:
- Use single traversal approach for optimal performance

*/

import java.util.Arrays;

public class SecondLargest_Element {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 22, 33, 2, 3 };

        secondLargest_Element(arr, arr.length);
        secondLargest_Element(arr);
    }

    // Approach 1: Sorting
    public static void secondLargest_Element(int[] arr, int n) {
        Arrays.sort(arr);
        int largest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest Element is: " + secondLargest);
        }
    }

    // Approach 2: Optimal Linear Scan
    public static void secondLargest_Element(int[] arr) {
        if (arr.length < 2) {
            System.out.println("No second largest element");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}
