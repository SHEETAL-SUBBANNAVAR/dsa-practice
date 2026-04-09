/*        UPPER BOUND (BINARY SEARCH)
         ============================
Problem: Given a sorted array nums and a value X,find the first index where element is strictly greater than X.
        (i.e., first position where nums[i] > X)
Example: Input: nums = [1, 3, 5, 7, 9], X = 5         Output: 3  (nums[3] = 7)

Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n
          - While low < high:
                mid = (low + high) / 2
                If nums[mid] > X → move left (high = mid)
                Else → move right (low = mid + 1)
          - Return low (answer index)
    Advantages:- Efficient and fast
               - Works in O(log n)
               - Useful for range-based problems

    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class UpperBound{
    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 7, 9};
        int x = 5;        //Output: 3  (nums[3] = 7)
        int result =upperbound(nums,0,nums.length,x);
        System.out.println(nums[result]);
    }
    public static int upperbound(int []arr ,int low,int high, int x){
        int val =0 ;
        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                val=mid;
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;

    }
}