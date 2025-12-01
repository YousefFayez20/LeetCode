class Solution {
    public int countBattleships(char[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        int count =0;
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(board[i][j] =='X'){
                    dfs(board,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] board,int r,int c){
        if(Math.min(r,c) <0||r == board.length||c == board[0].length || board[r][c] =='.') return;
        board[r][c] = '.';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);


    }
}