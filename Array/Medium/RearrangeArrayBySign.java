/*        REARRANGE ARRAY ELEMENTS BY SIGN (OPTIMAL)
          =========================================
Problem: Given an array nums[] with equal number of positive and negative numbers,
         rearrange it such that:- Alternate positive and negative
                                - Start with positive
                                - Maintain relative order (stable)
Example: Input: {3,1,-2,-5,2,-4}         Output: {3,-2,1,-5,2,-4}

Optimal Approach (Using Extra Array)
    Logic:- Create a new array ans[] of same size
          - Maintain two pointers:
                posIndex = 0  → even indices (0,2,4,...)
                negIndex = 1  → odd indices (1,3,5,...)
          - Traverse original array:
                If nums[i] > 0:
                    → Place at ans[posIndex]
                    → posIndex += 2
                Else:
                    → Place at ans[negIndex]
                    → negIndex += 2
    Advantages:- Simple and clean
               - Maintains order
               - No complex logic
    Time Complexity: O(N)
    Space Complexity: O(N)
*/
package Medium;
import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        reArrangeArray(arr);
    }

    public static void reArrangeArray(int[] arr) {
        int[] x = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                x[posIndex] = arr[i];
                posIndex += 2;
            } else {
                x[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        System.out.print(Arrays.toString(x));

    }
}
