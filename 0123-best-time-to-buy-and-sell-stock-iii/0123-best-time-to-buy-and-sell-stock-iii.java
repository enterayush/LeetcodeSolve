class Solution {
     int solve(int[] prices,int i,boolean buy,Integer[][][] dp,int transactions){
        if(i == prices.length || transactions==2) return 0;
        if (dp[i][buy ? 1 : 0][transactions] != null) {
            return dp[i][buy ? 1 : 0][transactions];
        }
        if(buy){
            return dp[i][1][transactions] = Math.max(-prices[i]+solve(prices,i+1,false,dp,transactions),solve(prices,i+1,true,dp,transactions));
        }
        else{
            return dp[i][0][transactions] = Math.max(prices[i]+solve(prices,i+1,true,dp,transactions+1),solve(prices,i+1,false,dp,transactions));
        }
    }
    public int maxProfit(int[] prices) {
         Integer[][][] dp = new Integer[prices.length][2][2]; 

        //  for(Integer[][] arr: dp){
        //     for(Integer[] row:arr){
        //         Arrays.fill(row,null);
        //     }
        //  }

        return solve(prices,0,true,dp,0);
    }
}