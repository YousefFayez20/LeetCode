class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        TreeMap<Integer,Integer> set = new TreeMap<>();
        for(int i =0;i<nums.length;i++){
            set.put(nums[i]*nums[i], set.getOrDefault(nums[i]*nums[i],0) +1);
        }
        for(int i=0;i<nums.length;i++){
            if(set.firstEntry().getValue()>=1){
                arr[i] = set.firstEntry().getKey();
            }
            set.put(set.firstEntry().getKey(), set.getOrDefault(set.firstEntry().getKey(),0)-1);
            if(set.firstEntry().getValue()<=0){
               set.remove(set.firstEntry().getKey());
            }
        }
        return arr;

    }
}