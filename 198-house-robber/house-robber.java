class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){ return nums[0];}
        else if(nums.length==2) {return Math.max(nums[0],nums[1]);}
        int[] dp = new int[2];
        for(int n:nums){
            int temp = dp[1];
            dp[1] = Math.max(dp[1],dp[0]+n);
            dp[0] = temp;
        }
        return dp[1];

        
    }
}