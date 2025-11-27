class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        for(int i=0;i<ROWS;i++){
            for(int j =0;j<COLS;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(grid,visited,i,j);
                }
            }
        }
        return count;
        }
        void dfs(char[][] grid,boolean [][] visited,int r,int c){
            if(Math.min(r,c) < 0 || r == grid.length || c== grid[0].length || visited[r][c] || grid[r][c] =='0' ){
                return;
            }
            visited[r][c] = true;
            dfs(grid,visited,r+1,c);
            dfs(grid,visited,r-1,c);
            dfs(grid,visited,r,c+1);
            dfs(grid,visited,r,c-1);
        }
    }
