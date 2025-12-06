class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            backtracking(permutations,new ArrayList<Integer>(),i,nums);
        }
        return permutations;
    }
    void backtracking(List<List<Integer>> permutations, List<Integer> permutation, int index, int[] nums){
       
        permutation.add(nums[index]);
         if(permutation.size() == nums.length){
            permutations.add(new ArrayList<>(permutation));
        }
        for(int i=0;i<nums.length;i++){
            if(!permutation.contains(nums[i])){
                backtracking(permutations,permutation,i,nums);
                permutation.remove(permutation.size()-1);
            }
            
        }
       


    }
}