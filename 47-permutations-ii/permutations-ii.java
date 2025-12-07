class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
            backtracking(permutations,new ArrayList<>(),map,nums.length);

        return permutations;
        
    }
    void backtracking(List<List<Integer>> permutations,List<Integer> permutation,HashMap<Integer,Integer> map, int arrLength){
        
        if(permutation.size() == arrLength){
            permutations.add(new ArrayList<>(permutation));
            return;
        }
        for(int n: map.keySet()){
           if(map.get(n)<=0) continue;
           permutation.add(n);
            map.put(n,map.getOrDefault(n,0)-1);
            backtracking(permutations,permutation,map,arrLength);
            permutation.remove(permutation.size()-1);
            map.put(n,map.getOrDefault(n,0)+1);


        }
        
    }
}