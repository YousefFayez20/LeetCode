class Solution {
    List<List<String>> results = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] row:board) Arrays.fill(row,'.');
        Set<Integer> cols = new HashSet<>();
        Set<Integer> posDiags = new HashSet<>();
        Set<Integer> negDiags = new HashSet<>();
        backtrack(0,board,cols,posDiags,negDiags);
        return results;
    }
    void backtrack(int row,char[][] board,Set<Integer> cols,Set<Integer> posDiags,Set<Integer> negDiags){
        if(row == board.length){
            List<String> result = new ArrayList<>();
            for(char[] r:board) result.add(new String(r));
            results.add(result);
        }
        for(int col=0;col<board[0].length;col++){
            if(cols.contains(col) ||posDiags.contains(row+col)||negDiags.contains(row-col)) continue;
            board[row][col] = 'Q';
            cols.add(col);
            posDiags.add(row+col);
            negDiags.add(row-col);
            backtrack(row+1,board,cols,posDiags,negDiags);
            board[row][col] = '.';
            cols.remove(col);
            posDiags.remove(row+col);
            negDiags.remove(row-col);
        }
    }
}