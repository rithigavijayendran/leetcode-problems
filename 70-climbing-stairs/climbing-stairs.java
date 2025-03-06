class Solution {
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int curr = 1;int prev = 1;int temp;
        for(int i=2;i<=n;i++){
            temp = curr;
            curr = prev+curr;
            prev = temp;
        }
        return curr;
    }
}