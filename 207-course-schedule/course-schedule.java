class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> pres = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            pres.put(i,new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            pres.get(pre[0]).add(pre[1]);
        }
        Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for(int course = 0;course<numCourses;course++){
            if(dfs(course,pres,visiting,visited) == false) return false;
        }
        return true;
    }
    boolean dfs(int course,Map<Integer,List<Integer>> pres,
    Set<Integer> visiting, Set<Integer> visited){
        if(visiting.contains(course)) return false;
        if(visited.contains(course)) return true;

        visiting.add(course);
        for(int pre : pres.get(course)){
            if(dfs(pre,pres,visiting,visited) == false) return false;
        }
        visiting.remove(course);
        visited.add(course);
        return true;
    }
}