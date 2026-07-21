class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[2*n];
        int i=0;
        int L=0;
        int R =n;
        while(i<n*2){
            if(L<n){
                x[i] = nums[L];
                 L++;
            }
            x[i+1] = nums[R];
            i=i+2;
            R++;
            }
        return x;
    }
}