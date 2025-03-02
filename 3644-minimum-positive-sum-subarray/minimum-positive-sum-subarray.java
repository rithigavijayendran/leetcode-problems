import java.util.List;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        boolean found = false;
        
     
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            
            for (int j = i; j < n && (j - i + 1) <= r; j++) {
                currentSum += nums.get(j);
                
                if ((j - i + 1) >= l && currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                    found = true;
                }
            }
        }
        
        return found ? minSum : -1;
    }
}