class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] memoization= new int[obstacleGrid.length][obstacleGrid[0].length];
        return dfs(obstacleGrid,0,0,memoization);
    }
    int dfs(int[][] obstacleGrid,int r, int c,int[][] memoization){
        if(Math.min(r,c)<0||r==obstacleGrid.length||c==obstacleGrid[0].length||obstacleGrid[r][c] ==1 ){
            return 0;
        }
        if(r==obstacleGrid.length-1 && c==obstacleGrid[0].length-1) return 1;
        if(memoization[r][c] >0) return memoization[r][c];
        obstacleGrid[r][c] =1;
        int count = 0;
        count += dfs(obstacleGrid,r+1,c,memoization);
        count += dfs(obstacleGrid,r,c+1,memoization);
        obstacleGrid[r][c] =0;
        memoization[r][c] = count;
        return memoization[r][c];

    }
}