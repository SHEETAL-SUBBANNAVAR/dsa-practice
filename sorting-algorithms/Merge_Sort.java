/*
Problem: Merge Sort
Write a program to sort an array using the Merge Sort algorithm.
Merge Sort works by dividing the array into smaller subarrays,
sorting them recursively, and then merging the sorted subarrays.

Input:
An array of integers.
Output:
A sorted array in ascending order.

- Time Complexity: O(n log n) for all cases
- Space Complexity: O(n)
- Stable: Yes

Steps:
1. Divide the array into two halves.
2. Recursively sort both halves.
3. Merge the two sorted halves.
4. Repeat until the entire array is sorted.

Example:
Input: [38, 27, 43, 3, 9, 82, 10]
Step 1:
Divide → [38, 27, 43, 3] and [9, 82, 10]
Step 2:
Divide → [38, 27] [43, 3] [9, 82] [10]
Step 3:
Divide → [38] [27] [43] [3] [9] [82] [10]
Step 4:
Merge → [27, 38] [3, 43] [9, 82] [10]
Step 5:
Merge → [3, 27, 38, 43] [9, 10, 82]
step 6:
Final Merge → [3, 9, 10, 27, 38, 43, 82]

Output:
[3, 9, 10, 27, 38, 43, 82]
*/
public class Merge_Sort {
    public static void main(String[] args) {
        int [] arr = {12,11,33,2,5,1};
        int n =arr.length;
        int low =0;
        int high =n-1;
        merge_sort(arr,low,high);
        for (int num : arr) {
    System.out.print(num + " ");
}

    }    
    public static void merge_sort( int [] arr ,int low ,int high){
        int mid= (low+high)/2;
        if(low >=high) return ;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr , low ,mid ,high);
    }
    public static void merge ( int [] arr ,int low ,int mid,int high){
        int temp [] = new int[high - low + 1];
        int left=low;
        int right =mid+1;
        int i=0;
        while(left<=mid && right<=high){
            if(arr[left]<= arr[right]){
                temp[i]=arr[left];
                left++;
                i++;
            }
            else {
                temp[i]=arr[right];
                right++;
                i++;
            }
        }
        // Copy any remaining elements from either left or right subarray
        while(left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }
        while(right <= high) {
            temp[i] = arr[right];
            right++;
            i++;
        }
        // Copy the merged elements back to the original array
        for(int j = low; j <= high; j++) {
            arr[j] = temp[j - low];
        }

    }
}
