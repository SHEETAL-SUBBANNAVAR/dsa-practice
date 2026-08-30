class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left = 0;
        for (int i = 0; i < k; i++) {
            left += cardPoints[i];
        }
        int max = left;
        int right = 0;
        for (int i = 0; i < k; i++) {
            left -= cardPoints[k - 1 - i];
            right += cardPoints[n - 1 - i];
            max = Math.max(max, left + right);
        }
        return max;
    }
}