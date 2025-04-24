class Solution {
    class Pair{
        int row;
        int col;
        public Pair(int r,int c){
            this.row = r;
            this.col = c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int day = 0;
        int f = 0;
        Queue<Pair> q = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    f++;
                }else if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
            }
        }

        while(q.size()>0){
            int qs = q.size();
            int flag = 0;
            for(int i=0;i<qs;i++){
                Pair rem = q.remove();
                int r = rem.row;
                int c = rem.col;
                int[][] direction ={{-1,0},{0,1},{1,0},{0,-1}};
                for(int j=0;j<4;j++){
                    int newrow = r+direction[j][0];
                    int newcol = c+direction[j][1];
                    if(newrow >= 0 && newcol >=0 && newrow <grid.length&&newcol<grid[0].length&&grid[newrow][newcol]==1){
                        grid[newrow][newcol] = 2;
                        q.add(new Pair(newrow,newcol));
                        f--;
                        flag = 1;
                    }
                }
            }
            if(flag == 1) day++;
        }
        if(f==0) return day;
        return -1;
    }
}