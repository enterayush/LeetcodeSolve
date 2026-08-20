class Solution {
    int solve(int i, int[] freq,int[] dp) {

        if (i <= 0) return 0;
        if (dp[i] != -1) return dp[i];
        int take = i * freq[i] + solve(i - 2, freq,dp);
        int notTake = solve(i - 1, freq,dp);

        return dp[i] =  Math.max(take, notTake);
    }
    public int deleteAndEarn(int[] nums) {
        int[] freq = new int[10001];

        for (int x : nums) {
            freq[x]++;
        }
        int[] dp = new int[10001];
        Arrays.fill(dp, -1);

        return solve(10000, freq,dp);
    }
}