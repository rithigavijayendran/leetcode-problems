class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int maxsum = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
            maxsum = sum;
        }
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            maxsum = Math.max(sum,maxsum);
        }
        return (double)maxsum/k;
    }
}