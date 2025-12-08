class Solution {
    public void solveSudoku(char[][] board) {
        
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char c = '1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j] ='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    boolean isValid(char[][] board,int row,int column,char value){
       for(int i=0;i<9;i++){
        if(board[row][i]==value) return false;
        if(board[i][column]==value) return false;
       }
       int r =(row/3)*3;
       int c =(column/3)*3;
       for(int i = r;i<r+3;i++){
        for(int j = c;j<c+3;j++){
            if(board[i][j] == value) return false;
        }
       }
       return true;
    }
}
