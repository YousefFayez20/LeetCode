class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> combinations = new ArrayList<>();
     backtrack(candidates,target,0,combinations,new ArrayList<>(),0);
        return combinations;
    }
    void backtrack(int[] candidates,int target,int sum,List<List<Integer>> combinations
    ,List<Integer> combination,int index){
        if(sum == target){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if(sum>target) return;
        for(int i =index;i<candidates.length;i++){
            sum += candidates[i];
            combination.add(candidates[i]);
         backtrack(candidates,target,sum,combinations,combination,i);
            sum -= candidates[i];
            combination.remove(combination.size()-1);
        }
    }
}