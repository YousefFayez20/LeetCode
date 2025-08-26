class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] visited = new int[ROWS][COLS];
        queue.offer(new int[2]); //(0,0) start point
        int length = 1;
        visited[0][0] = 1;
        if(grid[0][0] == 1 || grid[ROWS-1][COLS-1] == 1){
            return -1;
        }
        while(!queue.isEmpty()){
            int QueueLength = queue.size();
            for(int i = 0;i<QueueLength;i++){
                int[] pair = queue.poll();
                int R = pair[0];
                int C = pair[1];
                if(R == ROWS-1 && C == COLS -1){
                    return length;
                }
                int [][] neighbors = {{R+1,C},{R+1,C+1},{R+1,C-1},{R,C+1},{R-1,C},{R-1,C-1}, {R,C-1},{R-1,C+1}};
                for(int j = 0; j<neighbors.length;j++){
                    int newR = neighbors[j][0];
                    int newC = neighbors[j][1];
                    if(newR < 0 ||newC < 0|| newR == ROWS || newC == COLS ||visited[newR][newC] == 1 ||grid[newR][newC] == 1){
                        continue;
                    }
                    queue.offer(neighbors[j]);
                    visited[newR][newC] = 1;
                }

            }
            length++;
        }
        return -1;
    }
}