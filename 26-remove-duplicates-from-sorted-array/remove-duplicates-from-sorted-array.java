class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                nums[i] = 101;
            }else{
                set.add(nums[i]);
            }
        }
        Arrays.sort(nums);
        return set.size();
    }
}