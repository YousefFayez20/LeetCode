class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int fresh=0;
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j]==2)  queue.add(new int[]{i,j});
                if(grid[i][j]==1) fresh++;
               
            }
        }
        if(fresh == 0) return 0;
        int minutes = -1;
        while(!queue.isEmpty()){
            minutes++;
            int length= queue.size();
            for(int i =0;i<length;i++){
                int[] pair = queue.poll();
                int r = pair[0],c=pair[1];
                int[][] neighbors = {{r,c+1},{r-1,c},{r+1,c},{r,c-1}};
                for(int j=0;j<neighbors.length;j++){
                    int newR= neighbors[j][0], newC = neighbors[j][1];
                    if(Math.min(newR,newC)<0||newR>=ROWS||newC>=COLS||grid[newR][newC] !=1){
                        continue;
                    }
                    grid[newR][newC] =2;
                    queue.add(neighbors[j]);
                    fresh--;
                }
            }
            
        }
        
        return fresh == 0?minutes:-1;
        
    }
}