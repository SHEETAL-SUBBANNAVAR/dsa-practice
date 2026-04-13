/*        FIND SQUARE ROOT OF A NUMBER
          ============================
Problem: Given a non-negative integer x, find and return its square root.
         The result should be the integer part only (floor value).

Example: Input: x = 8      Output: 2
         Input: x = 16     Output: 4

Binary Search (Optimal)
    Logic:- Initialize low = 0, high = x
          - While low <= high:
                mid = (low + high) / 2
          - If mid * mid == x:
                → Found exact square root
                → Return mid
          - If mid * mid < x:
                → Move to right half
                → low = mid + 1
          - Else:
                → Move to left half
                → high = mid - 1
          - When loop ends, high will be the floor value of sqrt(x)
          - Return high

    Advantages:- O(log n) time complexity
               - Efficient for large numbers
               - No extra space required

    Time Complexity: O(log n)
    Space Complexity: O(1)
*/
public class Square_Root_ofa_Number {
    public static void main(String[] args) {
        int x = 16;
        int result = squareroot(x);
        System.out.println(result);
    }

    public static int squareroot(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == x)
                return mid;
            else if (mid * mid < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}
