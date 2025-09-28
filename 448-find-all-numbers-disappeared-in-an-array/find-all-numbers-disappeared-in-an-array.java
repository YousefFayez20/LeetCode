class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      //  List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //hashmap to store all number, then return occurances with 1
        for(int i=0;i<nums.length;i++){
            map.put(i+1,map.getOrDefault(i+1,0)+1);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        
    }
}