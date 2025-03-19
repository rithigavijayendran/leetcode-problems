class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        
        for(int c=0;c<m;c++){
            dp[n-1][c] = matrix[n-1][c];
        }

        for(int r=n-2;r>=0;r--){
            for(int c=0;c<m;c++){
                int down = dp[r+1][c];
                int left = (c>0)?dp[r+1][c-1]:Integer.MAX_VALUE;
                int right = (c<m-1)?dp[r+1][c+1]:Integer.MAX_VALUE;
                dp[r][c] = matrix[r][c]+Math.min(down,Math.min(left,right));
            }
        }
        int minfallsum = Integer.MAX_VALUE;
        for(int c=0;c<m;c++){
            minfallsum = Math.min(minfallsum,dp[0][c]);
        }

        return minfallsum;
    }
}