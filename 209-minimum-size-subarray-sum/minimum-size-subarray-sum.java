class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int MinWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int windowStart =0;
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            while(currentSum >= target){
                MinWindow = Math.min(MinWindow, i - windowStart + 1);
                currentSum -= nums[windowStart];
                windowStart++;
            }
        }
        return (MinWindow==Integer.MAX_VALUE)? 0: MinWindow;
        
    }
}