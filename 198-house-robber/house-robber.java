class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        int[] dp={0,0};
        for(int num : nums){
            int MaxRobs = Math.max(dp[0] + num,dp[1]);
            dp[0] = dp[1];
            dp[1] = MaxRobs;
        }
        return dp[1];
       
    }
}