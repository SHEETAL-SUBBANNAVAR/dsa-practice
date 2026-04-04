/*        FIND LARGEST ELEMENT IN AN ARRAY

Problem:Find the largest element in a given array.

Approach 1: Sorting Method
        Logic:- Sort the array in ascending order
                - The last element will be the largest
        Advantages:- Simple and easy to implement
                   - Works for all cases
        Disadvantages:- Not optimal because sorting is unnecessary
                    - Higher time complexity
        Time Complexity: O(n log n)
        Space Complexity: O(1) (in-place sorting)

Approach 2: Linear Scan (Optimal Approach)
        Logic:- Initialize max with first element
              - Traverse the array
              - Update max whenever a larger element is found
        Advantages:- Most efficient approach
              - Works for all cases (including negative numbers)
              - Best choice for interviews
        Time Complexity: O(n)
        Space Complexity: O(1)

Conclusion:
- Approach 2 is the best solution due to optimal time and space complexity.
- Always prefer linear scan over sorting for this problem.
*/
import java.util.*;

public class largest_element_approaches{
    public static void main(String[] args) {
        
    int [] arr={-12,-11,-22,-2};
    largestElementSorting(arr);
    largestElementLinear(arr);
    }
    
   // Approach 1: Sorting
    public static void largestElementSorting(int [] arr){
        Arrays.sort(arr);  
        System.out.println(arr[arr.length - 1]);
        
    }
    // Approach 2: Optimal Linear Scan
    public static void largestElementLinear(int[] arr ){
        int n= arr.length;
        int max= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        System.out.println( "max ="+max);
    }

}
