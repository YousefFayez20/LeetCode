class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtracking(0,nums,subsets,subset);
        return subsets;


    }
    void backtracking(int index, int[]nums,List<List<Integer>> subsets,List<Integer> subset){
        if(index == nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backtracking(index+1,nums,subsets,subset);
        subset.remove(subset.size()-1);
        backtracking(index+1,nums,subsets,subset);

        

    }
}