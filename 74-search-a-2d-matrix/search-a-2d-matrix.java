class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int L = 0;
        int R = matrix[0].length-1;

        for(int i = 0; i< matrix.length; i++){
            if(matrix[i][L] <= target && matrix[i][R] >= target){
                //do binary search
                while(L <= R){
                int middle = (R+L)/2;
                if(matrix[i][middle] > target){
                    R = middle - 1;
                }
                else if(matrix[i][middle] < target){
                    L = middle + 1;
                }
                else{
                    return true;
                }
                
            }
            break;
            }
        }
        return false;
    }
}