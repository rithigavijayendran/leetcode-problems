class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] psum = new int[n+1];
        psum[0] = gain[0];
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1]+gain[i];
        }
        int max = 0;
        for(int i=0;i<n+1;i++){
            max = Math.max(psum[i],max);
        }
        return max;
    }
}