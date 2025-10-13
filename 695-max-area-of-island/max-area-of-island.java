class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(dfs(i,j,grid),maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int r, int c, int[][] grid){
        if(Math.min(r,c) < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        area += dfs(r+1,c,grid);
        area += dfs(r-1,c,grid);
        area += dfs(r,c+1,grid);
        area += dfs(r,c-1,grid);
        return area;
    }
}