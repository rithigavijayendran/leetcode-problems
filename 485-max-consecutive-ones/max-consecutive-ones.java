class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int c = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i]==1){
                c++;
                maxi = Math.max(maxi,c);
            }
            else{
                c = 0;
            }
        }
        return maxi;
    }
}