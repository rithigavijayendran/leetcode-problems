class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int g = 0;
        while(i<j){
            int len = Math.min(height[i],height[j]);
            int bred = j - i;
            int c = len*bred;
            if(c>g){
                g = c;
            }
            else if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return g;
        
    }
}