class Solution {
public:
    vector<int> zigzagTraversal(vector<vector<int>>& grid) {
        vector<int> result;
        int rows = grid.size();
        int cols = grid[0].size();
        
        bool leftToRight = true; 
        int cellCount = 0;       
        
        for (int i = 0; i < rows; ++i) {
            if (leftToRight) {
                for (int j = 0; j < cols; ++j) {
                    if (cellCount % 2 == 0) {
                        result.push_back(grid[i][j]);
                    }
                    ++cellCount; 
                }
            } else {
                for (int j = cols - 1; j >= 0; --j) {
                    if (cellCount % 2 == 0) {
                        result.push_back(grid[i][j]);
                    }
                    ++cellCount; 
                }
            }
            leftToRight = !leftToRight; 
        }

        return result;
    }
};