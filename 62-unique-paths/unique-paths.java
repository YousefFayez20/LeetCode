class Solution {
    public int uniquePaths(int m, int n) {
        int [] prevR = new int[n];

        for(int i = m-1;i >=0;i--){
            int[] curR = new int[n];
            curR[n-1] =1;
            for(int j = n-2;j>=0;j--){
                curR[j] =curR[j+1]+ prevR[j];
            }
            prevR = curR;
        }
        return prevR[0];

    }
}