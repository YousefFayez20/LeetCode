class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        backtrack(paths,graph,new ArrayList<>(),0);
        return paths;
    }
    void backtrack( List<List<Integer>> paths,int[][] graph,List<Integer> path,int index){
        if(index == graph.length-1){
            path.add(index);
            paths.add(new ArrayList<>(path));
            return;
        }
        path.add(index);
        for(int element: graph[index]){
        backtrack(paths,graph,path,element);
        path.remove(path.size()-1);
        }
        


        


    }

}