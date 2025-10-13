class Solution {
    public boolean exist(char[][] board, String word) {
        boolean found = false;
        int rows = board.length;
        int columns = board[0].length;
        boolean [][] visited = new boolean[rows][columns];
        char firstChar = word.charAt(0);
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(board[i][j] == firstChar){
                    found = dfs(board,word,i,j,0, visited);
                    if (found == true){
                        return true;
                    }
                }
            }
        }
        return found;
    }
     public boolean dfs(char[][] board, String word, int r, int c ,int index,boolean[][] visited ){
        if(index == word.length()){
            return true;
        }
        if(Math.min(r,c) < 0||r >= board.length|| c>= board[0].length || word.charAt(index) != board[r][c] || visited[r][c]){
            return false;
        }
        visited[r][c] = true;
        boolean result = (dfs(board,word,r+1,c,index+1, visited) || dfs(board,word,r-1,c,index+1, visited) || dfs(board,word,r,c+1,index+1, visited) || dfs(board,word,r,c-1,index+1, visited));
        visited[r][c] = false; 
        return result;

     }
}