class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
            
            backtracking(candidates,0, target,new ArrayList<>(),0, combinations);
            return combinations;
        
    }
    public void backtracking(int[] candidates,int index,int target, List<Integer> combination,int sum,List<List<Integer>> combinations){
        if(sum == target){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if(sum > target || index >= candidates.length){
            return;
        }
        combination.add(candidates[index]);
        backtracking(candidates,index, target,combination,candidates[index]+sum,combinations);
        combination.remove(combination.size()-1);
        backtracking(candidates,index+1, target,combination,sum,combinations);

        

    }
}