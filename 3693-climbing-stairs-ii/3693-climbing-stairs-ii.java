class Solution {
    int climb(int i,int n,int[]costs,int[]dp){
        if(i>n) return Integer.MAX_VALUE/2;
        if(i==n)return costs[n];
        if(dp[i]!=-1) return dp[i];
        return dp[i]= costs[i]+Math.min(
            climb(i + 1, n, costs,dp)+ 1,
            Math.min(
                climb(i + 2, n, costs,dp) + 4,
                climb(i + 3, n, costs,dp) +9
            )
        );

    }
    public int climbStairs(int n, int[] costs) {
        int[] arr = new int[n + 1];
        System.arraycopy(costs, 0, arr, 1, n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climb(0,n,arr,dp);

    }
}