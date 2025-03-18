class Solution {
    int[][] dp;
    public int helper(int[][] nums,int m,int n,int r,int c){
        if(r>=m || c>=n) return Integer.MAX_VALUE;
        if(r==m-1 && c==n-1) return nums[r][c];
        if(dp[r][c] != -1) return dp[r][c];
        int right = helper(nums,m,n,r,c+1);
        int down = helper(nums,m,n,r+1,c);
        int min = Math.min(right,down)+nums[r][c];
        return dp[r][c] = min;
    }
    public int minPathSum(int[][] grid) {
        int r=0;
        int c=0;
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n];
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
        return helper(grid,m,n,r,c);
    }
}