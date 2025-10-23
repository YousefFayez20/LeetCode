class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int total = 0;
        for(int i=0;i<prefix.length;i++){
            total += nums[i];
            prefix[i] = total;
        }
        int before;
        int after;
        for(int i =0;i<prefix.length;i++){
            if(i > 0){
                before = prefix[i-1];
            }else{
                before = 0;
            }
            if(i == nums.length - 1){
                after = 0;
            }else{
                after = prefix[nums.length - 1] - prefix[i];
            }
            if(before == after){
                return i;
            }
            
        }
        return -1;
        
    }
}