class Solution {
    int [] nums = new int[31];
    public int fib(int n) {

        if(n ==1 || n==0){
            return n;
        }
        if(nums[n] != 0){
            return nums[n];
        }
        return nums[n] = fib(n-1) + fib(n-2);
        
    }
}