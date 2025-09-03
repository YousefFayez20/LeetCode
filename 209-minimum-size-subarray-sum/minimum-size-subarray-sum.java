class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        if(nums.length == 1){
           if(nums[0] > target){
            return 1;
           }else{
            return 0;
           }
        }
        int length = nums.length+1;
        int R = 0, L = 0;
        int total = nums[0];
        while(R < nums.length){
            if(total < target ){
                R++;
                if(R >=  nums.length) {break;}
                total += nums[R];
                
            }else{
                length = Math.min(length, R-L + 1);
                total -= nums[L];
                L++;
                if(L >=  nums.length) {break;}
            }
        }
        if(length == nums.length+1) return 0;
        return length;
        
    }
}