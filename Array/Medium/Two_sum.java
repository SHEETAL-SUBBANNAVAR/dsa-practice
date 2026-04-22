/*        TWO SUM (TWO POINTER APPROACH)
          =============================
Problem: Given an array of integers arr[] and a target, check if there exists a pair such that: arr[i] + arr[j] = target
     Return "YES" or "NO"
Example: Input: arr[] = {2,6,5,8,11}, target = 14
         Output: YES
         Input: arr[] = {2,6,5,8,11}, target = 15
         Output: NO

Two Pointer (Best without extra space)
    Logic:- First, sort the array
          - Initialize: left = 0            right = n - 1
          - While left < right:
                sum = arr[left] + arr[right]
                If sum == target:
                    → Pair found
                    → Return YES (or indices if needed)
                If sum < target:
                    → Need bigger sum
                    → Move left pointer forward (left++)
                Else (sum > target):
                    → Need smaller sum
                    → Move right pointer backward (right--)
          - If no pair found:
                → Return NO
    Time Complexity: O(N log N)  (due to sorting)
    Space Complexity: O(1)
*/


public class Two_sum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target=14;
        int result= sum(arr , target , 0 , arr.length-1);
        if(result == 1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    public static int  sum(int [] arr , int target ,int low,int high){
        while(low<high){
            int sum = arr[low]+arr[high];
            if(sum == target  ){
                return 1;
            }else if (sum < target){
                low++;
            }else{
                high--;
            }
        }
        return -1;
    } 
}
