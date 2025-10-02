class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int WindowSize = cards.length;
        boolean found = false;
        
        for(int EndIndex=0;EndIndex<cards.length;EndIndex++){
           if(map.containsKey(cards[EndIndex])){
            int prevIndex = map.get(cards[EndIndex]);
            WindowSize = Math.min(WindowSize, EndIndex-prevIndex+1);
           found = true;
           }
           map.put(cards[EndIndex],EndIndex);
        }
        return found? WindowSize:-1;
    }
}