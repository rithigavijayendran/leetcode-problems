class Solution {
public:
    int sumOfGoodNumbers(vector<int>& nums, int k) {
        int n = nums.size();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            bool isGood = true;
            
            // Check the left index
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false;
            }
            
            // Check the right index
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false;
            }
            
            if (isGood) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
};
