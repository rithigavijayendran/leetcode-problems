class Solution {
    int[][] dp;
    public int helper(int[][] nums,int m,int n,int r,int c){
        if(r>=m || c>=n || nums[r][c]==1) return 0;
        if(r==m-1 && c==n-1) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        int right = helper(nums,m,n,r,c+1);
        int down = helper(nums,m,n,r+1,c);
        int uniquepaths = right+down;
        return dp[r][c] = uniquepaths;
    }
    public int uniquePathsWithObstacles(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;
        dp = new int[r][c];
        for(int[]x:dp){
            Arrays.fill(x,-1);
        }
        return helper(nums,r,c,0,0);
    }
}