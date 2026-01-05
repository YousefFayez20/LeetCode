class Solution {
    public int deleteGreatestValue(int[][] grid) {
     for(int[] row:grid){
        Arrays.sort(row);
     }
     int total = 0;
     int rows = grid.length;
     int cols = grid[0].length;
     for(int j = cols-1 ;j >= 0;j--){
        int max = 0;
        for(int i =0;i<rows;i++){
            max = Math.max(max,grid[i][j]);
        }
        total += max;
     }
     return total;
    }
}