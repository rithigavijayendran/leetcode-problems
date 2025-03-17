class Solution {
    public int helper(int[] nums,int i,int[] dp){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0],nums[1]);
        if(dp[i]!=-1) return dp[i];
        int take = nums[i]+helper(nums,i-2,dp);
        int nottake = helper(nums,i-1,dp);
        return dp[i]=Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int i=nums.length-1;
        return helper(nums,i,dp);
    }
}