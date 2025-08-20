class Solution {
    public int climbStairs(int n) {
       int a = 2, b = 3;
       if(n <= b){
        return n;
       }
       for(int i = 4; i<=n;i++){
        int steps = a+b;
        a=b;
        b=steps;
       }
       return b;
        
    }
}