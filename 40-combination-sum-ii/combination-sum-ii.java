class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(candidates);
        for(int candidate:candidates){
            map.put(candidate,map.getOrDefault(candidate,0)+1);
        }
        backtrack(combinations,candidates,target,new ArrayList<>(),0,map,0);
        return combinations;
    }
    void backtrack(List<List<Integer>> combinations,int[] candidates, int target,List<Integer> combination,int sum, Map<Integer,Integer> map,int index){
        if(sum==target){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if(sum>target) return;
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            sum += candidates[i];
            combination.add(candidates[i]);
            map.put(candidates[i],map.getOrDefault(candidates[i],0)-1);
            backtrack(combinations,candidates,target,combination,sum,map,i+1);
            sum -= candidates[i];
            map.put(candidates[i],map.getOrDefault(candidates[i],0)+1);
            combination.remove(combination.size()-1);
            
        }
    }
}