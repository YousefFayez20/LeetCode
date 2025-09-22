class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> CurrSet = new ArrayList<>();
        List<List<Integer>> SubSet = new ArrayList<>();
        backtracking(0,nums,CurrSet,SubSet);
        return SubSet;

    }
    public void backtracking(int index, int[] nums,List<Integer> CurrSet,List<List<Integer>> SubSet ){
        if(index == nums.length){
            SubSet.add(new ArrayList<>(CurrSet));
            return;
        }
        CurrSet.add(nums[index]);
        backtracking(index+1,nums,CurrSet,SubSet);
        CurrSet.remove(CurrSet.size() - 1);
        backtracking(index+1,nums,CurrSet,SubSet);

    }
}