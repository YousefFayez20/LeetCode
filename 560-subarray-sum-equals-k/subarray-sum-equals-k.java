class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 1){
            return k;
        }
        for (int i = 1; i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
            
        }
        int count = 0;
        for (int i = 0; i<nums.length;i++){
            if(nums[i] == k) {count++;}
            for(int j = i+1;j<nums.length;j++){
                
                
                int result = nums[j] - nums[i];
                if(result == k ){
                count++;
            }
            
            }
         
        }
        return count;
    }
}