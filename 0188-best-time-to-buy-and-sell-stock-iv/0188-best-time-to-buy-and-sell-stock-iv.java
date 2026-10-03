class Solution {
    int solve(int[] prices,int i,boolean buy,Integer[][][] dp,int transactions,int k){
        if(i == prices.length || transactions==k) return 0;
        if (dp[i][buy ? 1 : 0][transactions] != null) {
            return dp[i][buy ? 1 : 0][transactions];
        }
        if(buy){
            return dp[i][1][transactions] = Math.max(-prices[i]+solve(prices,i+1,false,dp,transactions,k),solve(prices,i+1,true,dp,transactions,k));
        }
        else{
            return dp[i][0][transactions] = Math.max(prices[i]+solve(prices,i+1,true,dp,transactions+1,k),solve(prices,i+1,false,dp,transactions,k));
        }
    }
    public int maxProfit(int k, int[] prices) {
        Integer[][][] dp = new Integer[prices.length][2][k]; 
        return solve(prices,0,true,dp,0,k);
    }
}