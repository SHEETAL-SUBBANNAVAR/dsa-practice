/*                    MOVE ZEROS TO END
            =====================================

Problem:Given an array, move all zeros to the end while maintaining the relative order of non-zero elements.
Example:
Input:  [0, 1, 0, 3, 12] Output: [1, 3, 12, 0, 0]

Two Pointer Technique (Optimal)
    Logic:- Maintain pointer 'j' for position of next non-zero element
          - Traverse array with 'i'
          - Whenever non-zero found, swap arr[i] with arr[j]
          - Increment j

Advantages:- Maintains order
           - In-place modification
           - No extra space required

Time Complexity: O(n)
Space Complexity: O(1)

*/

import java.util.*;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZero(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static int  moveZero( int [] arr){
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j ;i<n;i++){
            arr[i]=0;
            
        }
        return j+1;
        
    }
}
