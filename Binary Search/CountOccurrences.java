/*        COUNT OCCURRENCES IN SORTED ARRAY
          ==================================
Problem: Given a sorted array nums and a value X,count how many times X appears.
Example: Input: nums = [1, 2, 2, 2, 3, 4], X = 2         Output: 3

Binary Search (Optimal)
    Logic:- Find First Occurrence of X
          - Find Last Occurrence of X
          - Count = last - first + 1
    Key Idea:- Use Binary Search twice
    Advantages:- Efficient O(log n)
               - No extra space required
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class CountOccurrences {
    public static void main(String[] args) {
        int [] arr ={1, 2, 2, 2, 3, 4};
        int x =2;   // o/p = 3
        int first = firstindex(arr,0,arr.length-1,x);
        int last = lastindex(arr,0,arr.length-1,x);
        int count = (first == -1) ? 0 : (last - first + 1);
        System.out.println(count);
    }
    public static int firstindex(int [] arr ,int low ,int high ,int x){
        int first =-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == x){
                first = mid;
                high=mid-1;
            }else if(arr[mid]>x){
                high =mid-1;
            }else {
                low=mid+1;
            }
        }return first;
    }
    public static int lastindex(int [] arr ,int low ,int high ,int x){
        int last =-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == x){
                last = mid;
                low=mid+1;
            }else if(arr[mid]>x){
                high =mid-1;
            }else {
                low=mid+1;
            }
        }return last;
    }
}
