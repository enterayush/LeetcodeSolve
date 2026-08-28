class Solution {
    int solve(int[][] matrix, int m ,int n, int i, int j, int[][]dp){
        if(i>=m || j <0 || j>=n) return Integer.MAX_VALUE;
        if(i == m-1) return matrix[i][j];
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        return dp[i][j] = matrix[i][j] + Math.min(solve(matrix,m,n,i+1,j-1,dp), Math.min(solve(matrix,m,n,i+1,j,dp),solve(matrix,m,n,i+1,j+1,dp)));
    }
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        for(int j =0;j<n;j++){
            ans = Math.min(ans, solve(matrix,m,n,0,j,dp));
        }
        return ans;
    }
}