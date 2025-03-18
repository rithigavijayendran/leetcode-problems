class Solution {
    public int uniquePaths(int r, int c) {
        int[][] dp = new int[r][c];
        for(int i=0;i<r;i++){
            dp[i][c-1] = 1;
        }
        for(int i=0;i<c;i++){
            dp[r-1][i] = 1;
        }
        for(int i=r-2;i>=0;i--){
            for(int j=c-2;j>=0;j--){
                dp[i][j] = dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}