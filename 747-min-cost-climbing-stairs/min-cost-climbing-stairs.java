class Solution {
    HashMap<Integer,Integer> cache = new HashMap<>();
    int total_cost =0;
    public int minCostClimbingStairs(int[] cost) {
        cache.put(0,cost[0]);
        cache.put(1,cost[1]);
        for(int i = 2;i<cost.length;i++){
        cache.put(i, cost[i]+ Math.min(cache.get(i-1),cache.get(i-2)));
        }
       return Math.min(cache.get(cost.length-1),cache.get(cost.length-2));
        
    }
    
}