class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> Curr= new ArrayList<>();
        List<List<Integer>> SubSets = new ArrayList<>();
        backtracking(0,nums,Curr,SubSets);
        return SubSets;

        
    }
    public void backtracking(int index, int[] nums,List<Integer> Curr,List<List<Integer>> SubSets)
    {
        if(index == nums.length){
            SubSets.add(new ArrayList(Curr));
            return;
        }
        Curr.add(nums[index]);
        backtracking(index+1,nums,Curr,SubSets);
        Curr.remove(Curr.size()-1);
        while(index < nums.length-1 && nums[index] == nums[index + 1]){
            index++;
        }
        backtracking(index+1,nums,Curr,SubSets);

    }
}