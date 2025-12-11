class Solution {
    public boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean found = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                found = backtracking(board,word,i,j,0,visited);
                if(found == true) return true;
            }
        }
        return false;
        
    }
    boolean backtracking(char[][] board, String word,int r,int c, int idx,boolean[][] visited){
        if(Math.min(r,c)<0||r==board.length||c==board[0].length|| word.charAt(idx) != board[r][c] || visited[r][c]) return false;
        if(idx == word.length()-1) return true;
        visited[r][c] = true;
        boolean moveLeft = backtracking(board,word,r,c-1,idx+1,visited);
        boolean moveRight = backtracking(board,word,r,c+1,idx+1,visited);
        boolean moveUp = backtracking(board,word,r-1,c,idx+1,visited);
        boolean moveDown = backtracking(board,word,r+1,c,idx+1,visited);
        visited[r][c] = false;
        return moveLeft ||moveRight||moveUp||moveDown;


    }
}