class Solution {
    int[][] dp;
    public int helper(int m,int n,int r,int c){
        if(r>=m || c>=n) return 0;
        if(r==m-1 || c==n-1) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        int right = helper(m,n,r,c+1);
        int down = helper(m,n,r+1,c);
        int uniquepaths = right+down;
        return dp[r][c] = uniquepaths;
    }
    public int uniquePaths(int m, int n) {
        int r=0;
        int c=0;
        dp = new int[m][n];
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
        return helper(m,n,r,c);
    }
}