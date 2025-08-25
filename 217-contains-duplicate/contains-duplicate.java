class Solution {
    public boolean containsDuplicate(int[] nums) {
        //we will add values to the hashmap, but before adding them search for keys, if exists then return true , if finished the loop 
HashMap<Integer, Integer> map = new HashMap<>();
for(int i = 0;i < nums.length ;i++){
    if(map.containsKey(nums[i]) == true){
        return true;
    }else{
        map.put(nums[i],1);
    }

}
return false;
        
    }
}