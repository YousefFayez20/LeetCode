class Solution {
    int[] memo  = new int[1001];
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 0; i < memo.length; i++) {
    memo[i] = -1;
}
        return Math.min(minCostClimbingStairsHandler(0,cost),minCostClimbingStairsHandler(1,cost));
    
        
    }
    public int minCostClimbingStairsHandler(int index ,int[] cost){
        if(index >= cost.length){
            return 0;
        }
        if(memo[index] != -1){
            return memo[index];
        }
        return memo[index]= cost[index] + Math.min(minCostClimbingStairsHandler(index+1,cost),minCostClimbingStairsHandler(index+2,cost));
    }
}