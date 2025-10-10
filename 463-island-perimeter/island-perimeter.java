class Solution {
    public int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] == 1){
                    perimeter += dfs(i,j,grid,visited);
                }
            }
        }
        return perimeter;
        
    }
    public int dfs(int rows,int cols,int[][] grid,boolean[][] visited){
        if(rows >= grid.length || cols >= grid[0].length ||rows < 0 || cols < 0 || grid[rows][cols] == 0){
            return 1;
        }
        if(visited[rows][cols] == true){
            return 0;
        }
        visited[rows][cols] = true;
        int perimeter = 0;
        perimeter += dfs(rows,cols-1,grid,visited);
        perimeter += dfs(rows,cols+1,grid,visited);
        perimeter += dfs(rows-1,cols,grid,visited);
        perimeter += dfs(rows+1,cols,grid,visited);
        return perimeter;



    }

}