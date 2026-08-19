// class Solution {
//     int solve(int[]cost,int i,int dp[]){
//         if(i==0 || i==1) return cost[i];

//         if(dp[i] !=-1) return dp[i]; 
//         dp[i]= cost[i] + Math.min(solve(cost,i-1,dp),solve(cost,i-2,dp));
//         return dp[i];

//     }
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
        
//         return Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
//     }

// }


class Solution {
    int solve(int[]cost,int i,int[] dp){
        if(i==0 || i==1) return 0;
        if(dp[i] != -1) return dp[i];
        dp[i] = Math.min((cost[i-1]+solve(cost,i-1,dp)),(cost[i-2]+solve(cost,i-2,dp)));
        return dp[i];

    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(cost,n,dp);
    }

}