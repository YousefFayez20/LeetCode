class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        backtrack(0,sets,new ArrayList<Integer>(),nums);
        return sets;
    
    }
    public void backtrack(int index, List<List<Integer>> sets, List<Integer> set, int[] nums){
        if(index == nums.length){
            sets.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[index]);
        backtrack(index+1,sets,set,nums);
        set.remove(set.size()-1);
        backtrack(index+1,sets,set,nums);


        
    }
}