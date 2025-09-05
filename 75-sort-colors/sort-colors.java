class Solution {
    public void sortColors(int[] nums) {
        //hashmap that store the numbers and their occurances
        //then iterate to the array and put the numbers
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int index = 0;
        for(int i = 0;i<3;i++){
            if(map.containsKey(i)){
             int k = map.get(i);
            for(int j = 0; j< k;j++){
                nums[index] =  i;
                index++;
            }
            }
           
        }
        
    }
}