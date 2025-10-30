class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowSize = 0;
        
        int MaxCount = 0;
        int zeroCount =0;
        int windowStart =0;

        for(int i = 0;i<nums.length;i++){
  
    if(nums[i] ==0){
                zeroCount++;
            }
           if(zeroCount <= k){ MaxCount = Math.max(MaxCount, i-windowStart+1); }
            while(zeroCount > k){
                if(nums[windowStart] ==0){
                    zeroCount--;
                }
                windowStart++;
                 
            }

        }
        return MaxCount;
    }
}