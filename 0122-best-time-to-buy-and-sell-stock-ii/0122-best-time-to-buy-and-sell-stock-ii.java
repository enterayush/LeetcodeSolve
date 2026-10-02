class Solution {
    int solve(int[] prices,int i,boolean buy,Integer[][] dp){
        if(i == prices.length) return 0;
        if (dp[i][buy ? 1 : 0] != null) {
            return dp[i][buy ? 1 : 0];
        }
        if(buy){
            return dp[i][1] = Math.max(-prices[i]+solve(prices,i+1,false,dp),solve(prices,i+1,true,dp));
        }
        else{
            return dp[i][0] = Math.max(prices[i]+solve(prices,i+1,true,dp),solve(prices,i+1,false,dp));
        }
    }
    public int maxProfit(int[] prices) {
        // int profit=0;
        // for(int i=1;i<prices.length;i++){
        //     if(prices[i]>prices[i-1]){
        //         profit += prices[i]-prices[i-1];
        //     }
        // }
        // return profit;
        Integer[][] dp = new Integer[prices.length][2]; 
        return solve(prices,0,true,dp);
        
    }
}