class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] ==1) return -1;
        Queue<int[]> queue = new ArrayDeque<>();
        int ROWS = grid.length;
        int COLS = grid[0].length;
        boolean[][] visited = new boolean[ROWS][COLS];
        queue.add(new int[2]);
        visited[0][0] = true;
        int length=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] pair = queue.poll();
                int r = pair[0],  c = pair[1];
                if(r == ROWS-1 && c == COLS-1 && grid[r][c] ==0){
                    return length;
                } 
                int[][] neighbors = {{r,c+1},{r,c-1},{r+1,c},{r-1,c},{r-1,c-1},
                {r+1,c+1},{r+1,c-1},{r-1,c+1}};
                for(int j = 0;j<neighbors.length;j++){
                    int newR = neighbors[j][0], newC = neighbors[j][1];
                    if(Math.min(newR,newC) < 0 || newR >= ROWS||newC >= COLS 
                    ||visited[newR][newC] == true ||grid[newR][newC] == 1){
                        continue;
                    }
                    queue.add(neighbors[j]);
                    visited[newR][newC] =true;
                }
            }
            length++;
        }
        return -1;

    }
}