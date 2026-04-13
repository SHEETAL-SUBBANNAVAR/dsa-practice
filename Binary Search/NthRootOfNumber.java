/*        FIND Nth ROOT OF A NUMBER
          =========================
Problem: Given two integers n and m, find the integer x such that: x^n = m
         If no such integer exists, return -1.
Example: Input: n = 3, m = 27      Output: 3
         Input: n = 2, m = 10      Output: -1

Binary Search (Optimal)
    Logic:- Initialize low = 1, high = m
          - While low <= high:
                mid = (low + high) / 2
          - Compute mid^n:
                If mid^n == m:
                    → Found exact root
                    → Return mid
                If mid^n < m:
                    → Move to right half
                    → low = mid + 1
                Else:
                    → Move to left half
                    → high = mid - 1
          - If not found, return -1
    Advantages:- O(log m) time complexity
               - Efficient for large numbers
               - Avoids brute force
    Time Complexity: O(log m * n)
    Space Complexity: O(1)
*/

public class NthRootOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int result = nthroot(n, m);
        System.out.println(result);
    }

    public static int nthroot(int n, int m) {
        int high = m;
        int low = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int l =(int) Math.pow(mid, n);
            if (l == m)
                return mid;
            else if(l<m ){
                low = mid + 1;
            }
            else{
                high =mid-1;
            }
        }
        return -1;
    }
}
