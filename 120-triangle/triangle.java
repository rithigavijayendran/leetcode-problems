import java.util.*;

class Solution {
    int[][] dp;

    public int helper(List<List<Integer>> triangle, int r, int c) {
        if(r>=triangle.size()||c>=triangle.get(r).size()) return Integer.MAX_VALUE;
        if (r == triangle.size() - 1) return triangle.get(r).get(c); 
        if (dp[r][c] != -1) return dp[r][c];
        
        int down = helper(triangle, r + 1, c); 
        int right = helper(triangle, r + 1, c + 1); 
        int min = Math.min(down,right)+triangle.get(r).get(c);
        return dp[r][c] = min;
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        dp = new int[m][m]; 
        for (int[] x : dp) {
            Arrays.fill(x, -1);
        }

        return helper(triangle, 0, 0);
    }
}
