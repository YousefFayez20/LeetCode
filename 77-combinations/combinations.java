class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtracking(combinations,combination,1,n,k);
        return combinations;
    }
    void backtracking(List<List<Integer>> combinations,List<Integer> combination,int i,int n, int k){
        if(combination.size() == k){
            combinations.add(new ArrayList<>(combination));
            return;
        }
        if(i>n){
            return;
        }
        combination.add(i);
        backtracking(combinations,combination,i+1,n,k);
        combination.remove(combination.size()-1);
        backtracking(combinations,combination,i+1,n,k);
    }
}