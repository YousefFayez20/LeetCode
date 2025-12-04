class Solution {
    HashMap<Integer,Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if( n <= 2){
            return n;
        }
        if(cache.get(n) != null){
            return cache.get(n);
        }else{
            cache.put(n,climbStairs(n-1)+climbStairs(n-2));
        }
        return cache.get(n);
    }
}