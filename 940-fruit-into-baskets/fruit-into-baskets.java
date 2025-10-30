class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> baskets = new HashMap<>();
        // size == 2, calculate window size , <Fruit,count>
        int windowStart = 0;
        int windowSize = 0;
        for(int i = 0;i<fruits.length;i++){
            baskets.put(fruits[i], baskets.getOrDefault(fruits[i],0)+1);
            if(baskets.size() <= 2){
                windowSize = Math.max(windowSize, i-windowStart+1);
            }
            while(baskets.size() >2){
                baskets.put(fruits[windowStart],baskets.getOrDefault(fruits[windowStart],0)-1);
                if(baskets.get(fruits[windowStart]) == 0){
                    baskets.remove(fruits[windowStart]);
                }
                windowStart++;
                
            }

        }
        return windowSize;
    }
}