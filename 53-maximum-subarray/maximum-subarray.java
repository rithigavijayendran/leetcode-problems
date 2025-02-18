class Solution {
    public int maxSubArray(int[] nums) {
        int gs = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<nums.length;i++){
            int op1 = nums[i];
            int op2 = nums[i]+cs;
            int myop = Math.max(op1,op2);
            cs = myop;
            gs = Math.max(cs,gs);

        }
        return gs;
        
    }
}