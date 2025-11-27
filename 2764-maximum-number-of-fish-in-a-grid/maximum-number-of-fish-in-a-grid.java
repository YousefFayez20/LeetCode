class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j]>0){
                    maxFish = Math.max(maxFish,dfs(grid,i,j));
                }
            }
        }
        return maxFish;
    }
    int dfs(int[][]grid,int r,int c){
        if(Math.min(r,c)<0 || r==grid.length||c==grid[0].length || grid[r][c] == 0){
            return 0;
        }
        int Area = grid[r][c];
        grid[r][c] =0;
        Area += dfs(grid,r+1,c);
        Area += dfs(grid,r-1,c);
        Area += dfs(grid,r,c+1);
        Area += dfs(grid,r,c-1);
        return Area;



    }
}