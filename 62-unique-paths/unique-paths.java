class Solution {
    public int uniquePaths(int m, int n) {
        boolean[][] visited = new boolean[m][n];
        int[][] memoization = new int[m][n];
        return dfs(0,0,m,n,visited,memoization);
    }
    int dfs(int r,int c,int m, int n,boolean[][] visited,int[][] memoization){
        if(Math.min(r,c)<0||r==m||c==n|| visited[r][c] ==true){
            return 0;
        }
        if(r == m-1 && c == n-1) return 1;
        if(memoization[r][c] != 0) return memoization[r][c];
        int count =0;
        visited[r][c] = true;
        count += dfs(r+1,c,m,n,visited,memoization);
        count += dfs(r,c+1,m,n,visited,memoization);
        memoization[r][c] = count;
        visited[r][c] = false;
        return memoization[r][c];

    }
}