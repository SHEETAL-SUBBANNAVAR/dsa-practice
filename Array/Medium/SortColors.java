/*        SORT COLORS (ALL APPROACHES)
          ===========================
Problem: Given an array nums[] containing only 0s, 1s, and 2s, sort them in-place in order: 0 → 1 → 2
Example: Input: {2,0,2,1,1,0}         Output: {0,0,1,1,2,2}

1) BRUTE FORCE (SORTING)    Logic:- Use any sorting algorithm (like Bubble, Merge, etc.)
                            Disadvantage:- Not allowed in problem (no built-in sort)
                            - Unnecessary work for limited values
                             Time Complexity: O(N log N)                 Space Complexity: Depends on sort

2) HASHMAP / FREQUENCY COUNT    Logic:- Count occurrences of 0s, 1s, and 2s using map or array
                                      - Traverse array and count:count0, count1, count2
                                      - Overwrite array:Fill count0 times → 0, Fill count1 times → 1,Fill count2 times → 2
                                Advantages:- Very easy to understand
                                           - Simple implementation
                                Disadvantages:- Extra space used
                                              - Not truly in-place (if map used)
                                Time Complexity: O(N)   Space Complexity: O(N) (HashMap) or O(1) (count variables)

3) BETTER (COUNTING WITHOUT HASHMAP)    Logic:- Same as above but use only 3 variables:  count0, count1, count2
                                              - First pass → count values    - Second pass → overwrite array  Advantages:- Simple and efficient
                                             - No extra data structures
                                       Time Complexity: O(N)    Space Complexity: O(1)

4) OPTIMAL (DUTCH NATIONAL FLAG ALGORITHM)  Logic:- Use 3 pointers:  low = 0    mid = 0           high = n - 1
                                                 - While mid <= high: If nums[mid] == 0:  → Swap nums[low] and nums[mid]  → low++, mid++
                                                                      If nums[mid] == 1:  → mid++
                                                                      If nums[mid] == 2:  → Swap nums[mid] and nums[high]  → high--   → Do NOT increment mid

       Advantages:- Single pass (one traversal)
                  - No extra space
                 - Most efficient
        Time Complexity: O(N)
        Space Complexity: O(1)
*/
package Medium;
import java.util.Arrays;
import java.util.HashMap;

public abstract class SortColors {
    public static void main(String[] args) {
        int[] arr1 = { 2, 0, 2, 1, 1, 0 };
        sort_Brute_Force(arr1);
        solve_by_Hashmap(arr1);
        solve_by_Counting(arr1);
        solve_by_dutch_Algo(arr1);
    }

    public static void sort_Brute_Force(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve_by_Hashmap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        int count0 = map.getOrDefault(0, 0);
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        int count1 = map.getOrDefault(1, 0);
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }
        int count2 = map.getOrDefault(2, 0);
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void solve_by_Counting(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            else if (arr[i] == 1)
                count1++;
            else if (arr[i] == 2)
                count2++;
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }
        for (int i = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void solve_by_dutch_Algo(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            if (arr[mid] == 1)
                mid++;
            if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
