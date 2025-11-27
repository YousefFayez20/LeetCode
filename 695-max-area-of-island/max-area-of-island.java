class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    maxArea = Math.max(maxArea,dfs(grid,visited,i,j));
                }
            }
        }
        return maxArea;
    }
    int dfs(int[][] grid,boolean[][] visited,int r,int c){
        if(Math.min(r,c) < 0 || r==grid.length || c== grid[0].length||visited[r][c]||grid[r][c] == 0){
            return 0;
        }
        int area = 1;
        visited[r][c] = true;
        area += dfs(grid,visited,r+1,c);
        area += dfs(grid,visited,r-1,c);
        area += dfs(grid,visited,r,c+1);
        area += dfs(grid,visited,r,c-1);
        return area; 

    }
}