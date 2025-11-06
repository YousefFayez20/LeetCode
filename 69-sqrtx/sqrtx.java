class Solution {
    public int mySqrt(int x) {
        long L=0,R = (long)x+1;
        while(L<R){
            long mid=L+(R-L)/2;
            if(mid*mid >x){
                R = mid;
            }else{
                L = mid+1;
            }
        }
        return (int)(L-1);
    }
}