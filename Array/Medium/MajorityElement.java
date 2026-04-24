/*                 MAJORITY ELEMENT 
          ================================
Problem: Given an array nums[] of size n, find the element that appears more than ⌊n/2⌋ times (majority element).
         It is guaranteed that such an element exists.
Example: Input: {3,2,3}              Output: 3
         Input: {2,2,1,1,1,2,2}      Output: 2

1) BRUTE FORCE
    Logic:- For each element:
                Count its frequency using another loop
                If count > n/2 → return that element
    Disadvantages:- Nested loops → very slow
    Time Complexity: O(N^2)
    Space Complexity: O(1)

2) HASHMAP (FREQUENCY COUNT)
    Logic:- Use HashMap:(element → frequency)
          - Traverse array and store counts
          - Check which element has count > n/2
    Advantages:- Easy to understand
               - Works for all cases
    Disadvantages:- Uses extra space
    Time Complexity: O(N)
    Space Complexity: O(N)

3) SORTING
    Logic:- Sort the array
          - Majority element will always be at index n/2
    Example:- {2,2,1,1,1,2,2} → {1,1,1,2,2,2,2}
                              → element at n/2 = 2
    Advantages:- Simple logic
    Disadvantages:- Sorting cost
    Time Complexity: O(N log N)
    Space Complexity: O(1) (if in-place sort)

4) OPTIMAL (BOYER-MOORE VOTING ALGORITHM)
    Logic:- Maintain:candidate             count = 0
          - Traverse array:
                If count == 0:
                    → Set candidate = current element
                If current == candidate:
                    → count++
                Else:
                    → count--
          - Final candidate is the majority element
    Key Insight:- Majority element cancels out all other elements
    Why it works:
        Since majority element appears more than n/2 times,
        it will always remain as the final candidate.
    Advantages:- Single pass
               - No extra space
               - Most efficient
    Time Complexity: O(N)
    Space Complexity: O(1)

*/
package Medium;
import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 3 }; // Output: 3
        int arr2[] = { 2, 2, 1, 1, 1, 2, 2 }; // Output: 2
        int result1H = solve_by_Hashmap(arr1);
        int result2H = solve_by_Hashmap(arr2);
        System.out.print("The MajorityElement using Hashmap = " + result1H);
        System.out.println("            The MajorityElement using Hashmap = " + result2H);
        int result1S = solve_by_sorting(arr1);
        int result2S = solve_by_sorting(arr2);
        System.out.print("The MajorityElement using sorting = " + result1S);
        System.out.println("            The MajorityElement using sorting = " + result2S);
        int result1O = optimal_solution(arr1);
        int result2O = optimal_solution(arr2);
        System.out.print("The MajorityElement using OPTIMAL solution = " + result1O);
        System.out.println("     The MajorityElement using OPTIMAL solution = " + result2O);
    }

    public static int solve_by_Hashmap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static int solve_by_sorting(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n / 2];

    }
    public static int optimal_solution(int[] arr) {
        int count =0; 
        int candidate = 0;
        for(int num :arr){
            if(count == 0){
                candidate=num;
            }
            if(candidate == num) count++;else count --;
        }
        return candidate;
    }
}
