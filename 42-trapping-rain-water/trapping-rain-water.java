class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length-1;
        int[] ps = new int[n+1];
        int[] ss = new int[n+1];
        ps[0] = height[0];
        for(int i=1;i<height.length;i++){
            ps[i] = Math.max(height[i],ps[i-1]);
        }
        ss[n] = height[n];
        for(int i = n-1;i>=0;i--){
            ss[i] = Math.max(ss[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            ans+=Math.min(ps[i],ss[i])-height[i];
        }
        return ans;
        
    }
}