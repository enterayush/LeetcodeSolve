class Solution {
    int up=0;
    int left=1;
    long mod = 1000000007;
    int solve(int[][] grid, int m, int n, int i, int j, int from,int[][][]dp){
        if(i>=m || j>=n) return 0;
        if(i == m-1 && j==n-1) return 1;
        if(dp[i][j][from] != -1) return dp[i][j][from];
        if(grid[i][j] == 1){
            if(from == left){
                return dp[i][j][from] = solve(grid,m,n,i+1,j,up,dp);
            }
            else{
                return dp[i][j][from] = solve(grid,m,n,i,j+1,left,dp);
            }
        }
        long down = solve(grid,m,n,i+1,j,up,dp);
        long right = solve(grid,m,n,i,j+1,left,dp);
        return dp[i][j][from]= (int)((right+down)%mod);
    }
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][2];
        for (int[][] matrix : dp) {
            for (int[] row : matrix) {
                Arrays.fill(row, -1); 
            }
        }

        return solve(grid,m,n,0,0,up,dp);
        
    }
}   