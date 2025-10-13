class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        int rows = board.length;
        int columns = board[0].length;
        for(int i = 0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(board[i][j] == 'X'){
                    count++;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }
    private int dfs(char[][] board, int r, int c){
        if(Math.min(r,c) <0 || r >= board.length || c >= board[0].length || board[r][c] == '.'){
            return 0;
        }
        board[r][c] = '.';
        dfs(board, r,c+1);
        dfs(board, r,c-1);
        dfs(board, r+1,c);
        dfs(board, r-1,c);

        return 1;
    }
}