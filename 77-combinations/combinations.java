class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> CurSet = new ArrayList<>();
        List<List<Integer>> Combinations = new ArrayList<>();
        backtracking(CurSet,Combinations,1,n,k);
        return Combinations;

    }
    public void backtracking(List<Integer> CurSet,List<List<Integer>> Combinations,int index, int n, int k){
        if(CurSet.size() == k){
            Combinations.add(new ArrayList<>(CurSet));
            return;
        }
        if(index>n){
            return;
        }


        CurSet.add(index);
        backtracking(CurSet,Combinations,index+1,n,k);
        CurSet.remove(CurSet.size() -1);
        backtracking(CurSet,Combinations,index+1,n,k);

    }
}