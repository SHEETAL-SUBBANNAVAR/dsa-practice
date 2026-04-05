package DSA_Array_Rotation;
/*                LEFT ROTATE ARRAY BY ONE
        ==========================================================

Problem:Given an array, rotate it to the left by one position.
Example:
Input:  [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]

Approach: Single Traversal
        Logic:- Store the first element in a temporary variable
              - Shift all elements one position to the left
              - Place the stored element at the end

Time Complexity: O(n)
Space Complexity: O(1)

*/
public class Left_rotate_array_by_one {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateByOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void leftRotateByOne(int [] arr){
        int temp =arr[0];
        if(arr.length <= 1) return;
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp; 
    }
}
