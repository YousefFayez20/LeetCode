class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<score.length;i++){
            pq.add(score[i]);
        }
        String[] ranks = new String[score.length];
        int order = 1;
        while(!pq.isEmpty()){
            int toretto = pq.poll();
            for(int i = 0;i<score.length;i++){
                if(score[i] == toretto){
                    if(order == 1){
                        ranks[i] = "Gold Medal";
                    }else if(order == 2){
                        ranks[i] = "Silver Medal";
                    }
                    else if(order == 3){
                        ranks[i] = "Bronze Medal";
                    }else{
                        ranks[i] = Integer.toString(order);
                    }
                }
            }
            order++;
        }
        return ranks;
        
    }
}