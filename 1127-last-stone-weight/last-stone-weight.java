class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size() >= 2){
            int y = pq.poll();
            int x = pq.poll();
            if(y !=x ){
                pq.add(y-x);
            }
        }
        if(pq.size()==1){
            return pq.peek();
        }else{
            return 0;
        }

        
    }
}