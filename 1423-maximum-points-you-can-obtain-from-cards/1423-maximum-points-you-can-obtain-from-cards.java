class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int sum = 0;

        // Initially take all k cards from right
        for (int i = n - k; i < n; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        int left = 0;
        int right = n - k;

        while (left < k) {

            sum += cardPoints[left];
            sum -= cardPoints[right];

            max = Math.max(max, sum);

            left++;
            right++;
        }

        return max;
    }
}