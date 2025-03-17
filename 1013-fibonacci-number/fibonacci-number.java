class Solution {
    public int fibo(int n,int[] dp){
        Arrays.fill(dp,-1);
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        int left = fibo(n-2,dp);
        int right = fibo(n-1,dp);
        dp[n] = left+right;
        return dp[n];
        
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
}