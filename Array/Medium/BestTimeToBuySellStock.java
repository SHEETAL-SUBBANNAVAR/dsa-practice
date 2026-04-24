/*        BEST TIME TO BUY AND SELL STOCK (OPTIMAL)
          ========================================
Problem: Given an array prices[] where prices[i] is the stock price on day i,find the maximum profit by buying on one day and selling on a future day.
         If no profit is possible, return 0.
Example: Input: {7,1,5,3,6,4}         Output: 5   → Buy at 1, Sell at 6
         Input: {7,6,4,3,1}          Output: 0

Optimal Approach (Single Pass)
    Logic:- Maintain:minPrice = prices[0]              maxProfit = 0
          - Traverse array from index 1:
                If prices[i] < minPrice:    → Update minPrice (best day to buy)
                Else: → Calculate profit = prices[i] - minPrice  
                      → Update maxProfit = max(maxProfit, profit)
    Time Complexity: O(N)
    Space Complexity: O(1)
*/
package Medium;
public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {7, 6, 4, 3, 1};
        int result1 = bestTimetoBuySell(arr1);
        int result2 = bestTimetoBuySell(arr2);
        System.out.println("Max Profit for Array 1: " + result1);
        System.out.println("Max Profit for Array 2: " + result2);
    }

    public static int bestTimetoBuySell(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}