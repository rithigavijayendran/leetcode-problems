class Solution {
public:
    vector<int> generaterows(int row){
        vector<int> ansrow;
        long long ans = 1;
        ansrow.push_back(1);
        for(int c=1;c<row;c++){
            ans = ans*(row-c);
            ans = ans/c;
            ansrow.push_back(ans);
        }
        return ansrow;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        for(int i=1;i<=numRows;i++){
            res.push_back(generaterows(i));
        }
        return res;
        
    }
};