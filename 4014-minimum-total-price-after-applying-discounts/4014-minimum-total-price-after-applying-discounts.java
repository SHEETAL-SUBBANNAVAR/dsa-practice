class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double sum = 0.0;
        int n = Math.min(prices.length, discounts.length);

        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (j >= 0 && i >= 0) {
            sum += prices[i] * (100.0 - discounts[j]) / 100.0;
            i--;
            j--;
        }

        while (i >= 0) {
            sum += prices[i];
            i--;
        }

        return sum;
    }
    
}