class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum +=nums[i];
        }
        double max_average = sum/(k*1.00000);
        for(int i = k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            if(max_average < sum/(k*1.00000)) max_average = sum/(k*1.00000);
        }
        return max_average;
    }
}