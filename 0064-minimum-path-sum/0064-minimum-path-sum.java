class Solution {
    int solve(int[][] grid, int m ,int n, int i, int j, int[][]dp){
        if(i == m-1 && j == n-1) return grid[i][j];
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(solve(grid,m,n,i+1,j,dp) , solve(grid,m,n,i,j+1,dp));
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(grid,m,n,0,0,dp);
    }
}