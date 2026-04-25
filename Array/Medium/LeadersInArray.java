/*        LEADERS IN AN ARRAY (OPTIMAL)
          =============================
Problem: Given an array arr[], find all elements that are greater than all elements to their right. These elements are called leaders.

Example: Input: {4, 7, 1, 0}         Output: {7, 1, 0}
         Input: {10, 22, 12, 3, 0, 6}        Output: {22, 12, 6}

Optimal Approach (Traverse from Right)
    Logic:- Start from the rightmost element
                → It is always a leader
          - Maintain: maxRight = last element
          - Traverse from right to left:
                If arr[i] >= maxRight:
                    → It is a leader
                    → Update maxRight = arr[i]
          - Store leaders and reverse result (optional for order)
    Time Complexity: O(N)
    Space Complexity: O(N) (to store result)
*/
package Medium;
public class LeadersInArray {
    public static void main(String[] args) {
        int [] arr = { 10, 22, 12, 3, 0, 6}; //Output: {22, 12, 6}
        leader(arr);
    }
    public static void leader(int [] arr){
        int maxRight= arr[arr.length-1];
        int index=0;
        int [] result = new int[arr.length];
        result[index++] = maxRight;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=maxRight){
                maxRight = arr[i];
                result[index]=arr[i];
                index++;
            }
        }System.out.print("[");
        for(int i=index-1;i>=0;i--){
            System.out.print(result[i] );
            if(i != 0) System.out.print(", ");
        }
        System.out.print("]");

    }
}
