class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i],true);
            }else{
                map.put(nums[i],false);
            }
        }
        Set<Map.Entry<Integer,Boolean>> entries = map.entrySet();
        for(Map.Entry<Integer,Boolean> entry : entries){
            if(entry.getValue() == false){
                return entry.getKey();
            }
        }
        return 1;
        
    }
}