/*        FIND PEAK ELEMENT
          ==================
Problem: Given an array nums, find a peak element and return its index.
         A peak element is strictly greater than its neighbors.
         You can assume nums[-1] = nums[n] = -∞
Example: Input: nums = [1,2,3,1]           Output: 2
         Input: nums = [1,2,1,3,5,6,4]    Output: 1 or 5 (any peak index)

Binary Search (Optimal)
    Logic:- Initialize low = 0, high = n-1
          - While low < high:
                mid = (low + high) / 2
          - Compare nums[mid] and nums[mid + 1]:
                If nums[mid] < nums[mid + 1]:
                    → Peak lies in right half
                    → low = mid + 1
                Else:
                    → Peak lies in left half (including mid)
                    → high = mid
          - When loop ends, low == high
          - Return low (index of peak element)
    Advantages:- O(log n) time complexity
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class FindPeakElement {
   public static void main(String[] args) {
    int [] arr1 =  {1,2,3,1}; //Output: 2
    int arr2[]= {1,2,1,3,5,6,4}; //Output: 1 or 5
    int result1= find(arr1,0,arr1.length-1); 
    int result2= find(arr2,0,arr2.length-1); 
    System.out.println( result1);
    System.out.println( result2);
   } 
   public static int find(int [] arr,int low,int high){
    while(low<high){
        int mid = (low+high)/2;
        if(arr[mid] < arr[mid+1]){
            low=mid+1;
        }else{
            high=mid;
        }
    }
    return low;
   }
}
