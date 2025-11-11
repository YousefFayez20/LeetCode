class Solution {
    public int numEnclaves(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int land = 0;
        int border = 0;
        for(int r =0;r<grid.length;r++){
            for(int c = 0;c<grid[0].length;c++){
                land += grid[r][c];
                if(grid[r][c] ==1 && visited[r][c] == false &&(c==0 || c== grid[0].length-1 || r==0 || r==grid.length-1) ){
                    border += dfs(grid,r,c,visited);
                }

            }
        }
        return land - border;
    }
    public int dfs(int[][] grid,int r, int c,boolean[][] visited){
        if(Math.min(r,c) < 0 || r>= grid.length || c>=grid[0].length ||visited[r][c] == true || grid[r][c]==0  ){
            return 0;
        }
        int count = 1;
        visited[r][c] = true;
        count += dfs(grid,r+1,c,visited);
        count += dfs(grid,r-1,c,visited);
        count += dfs(grid,r,c+1,visited);
        count += dfs(grid,r,c-1,visited);
        return count;




    }
}