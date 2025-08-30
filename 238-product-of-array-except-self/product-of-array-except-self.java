class Solution {
    public int[] productExceptSelf(int[] nums) {
        // result[i] = pre[i-1] + pos[i+1]
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int total_pre = 1;
        int total_pos = 1;
        for(int i = 0;i<nums.length;i++){
            total_pre *= nums[i];
            pre[i] = total_pre;
            total_pos *= nums[(nums.length -1) - i];
            post[(nums.length -1) - i] = total_pos;
        }
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(i == 0){
                result[i] = 1 * post[i+1];
            }else if(i == nums.length - 1){
                result[i] = pre[i-1] * 1;
            }else{
              result[i] = pre[i-1] * post[i+1];
            }
            
        }
        return result;
        
    }
}