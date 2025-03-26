class Solution {
    public int findsum(int[] nums,int i,int j){
        int sum = 0;
        for(int k=i;k<j;k++){
            sum+=nums[k];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int i=0;
        int n = nums.length;
        int ans = -1;
        while(i<n){
        int leftsum = i==0?0:findsum(nums,0,i);
        int rightsum = i==n-1?0:findsum(nums,i+1,n);
        if(leftsum==rightsum){
            ans = i;
            break;
        }
        i++;
    }
    return ans;
    }
}