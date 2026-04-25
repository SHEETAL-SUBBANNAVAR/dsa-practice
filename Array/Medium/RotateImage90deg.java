/*        ROTATE IMAGE (90 DEGREE CLOCKWISE - OPTIMAL)
          ===========================================
Problem: Given an n x n matrix, rotate it 90 degrees clockwise in-place.
Example: Input:{ {1,2,3},
                 {4,5,6},
                 {7,8,9} }
         Output: { {7,4,1},
                   {8,5,2},
                   {9,6,3} }
Optimal Approach (Transpose + Reverse)
    Logic:- Step 1: Transpose the matrix
                → Convert rows into columns
                → Swap matrix[i][j] with matrix[j][i]
          - Step 2: Reverse each row
                → Swap elements from left to right
    Advantages:- In-place (no extra matrix)
               - Simple and efficient

    Time Complexity: O(N^2)
    Space Complexity: O(1)
*/
package Medium;
import java.util.Arrays;

public class RotateImage90deg {
    public static void main(String[] args) {
            int [] [] arr ={ {1,2,3},
                     {4,5,6},
                     {7,8,9} }; 
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr[0].length;j++){
                    int temp =arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp; 
                }
            }
           for(int i=0;i<arr.length;i++){
            int left=0;int right=arr.length-1;
            while(left<right){
                int temp =arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }

           }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
