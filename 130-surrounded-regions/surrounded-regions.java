class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int columns = board[0].length;
        for(int i = 0;i<rows;i++){
            dfs(board,i,0);
            dfs(board,i,columns-1);

        }  for(int i = 0;i<columns;i++){
            dfs(board,0,i);
            dfs(board,rows-1,i);
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'S') board[i][j] = 'O';
                

            }
        }

        
    }
         public void dfs(char[][] board,int r, int c){
            if(Math.min(r,c) < 0||r >= board.length|| c >= board[0].length ||board[r][c] != 'O' ){
                return;
            }
            board[r][c] = 'S';
            
            dfs(board,r+1,c);
            dfs(board,r-1,c);
            dfs(board,r,c+1);
            dfs(board,r,c-1);
        

         }
}