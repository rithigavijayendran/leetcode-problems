class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    int area = dfs(grid,i,j);
                    maxarea = Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }
    int dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int up = dfs(grid,i,j+1);
        int down = dfs(grid,i+1,j);
        int left = dfs(grid,i,j-1);
        int right = dfs(grid,i-1,j);
        return 1+up+down+left+right;
    }
}