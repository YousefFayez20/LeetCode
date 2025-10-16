class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
         Map<Integer,ArrayList<Integer[]>> adj = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            adj.put(i,new ArrayList<>());
        }
        //we will need to connect edges
        //times[0] = {0 -> src, vi -> neighbor,w -> time}
        for(int[] time: times){
            int src = time[0];
            int v = time[1];
            int w = time[2];
            adj.get(src).add(new Integer[]{v,w});
        }
        //we will create a hash table which maintains the shortest path from every node to target
        HashMap<Integer,Integer> shortest = new HashMap<>();//<Node, Weight>
        //we will create minHeap to have pairs of node
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((n1,n2) -> n1[1] - n2[1]);// (node,cost)
        minHeap.add(new int[]{k,0});
        while (!minHeap.isEmpty()){
            int[] pair = minHeap.poll();
            if(shortest.containsKey(pair[0])){
                continue;
            }
            shortest.put(pair[0],pair[1]);
            //we will add the neighbors to the heap
            for(Integer[] x : adj.get(pair[0])){
                //x = [v,w]
                minHeap.add(new int[]{x[0],pair[1]+x[1]});
            }
        }
        int minCost = -1;
        for (Map.Entry<Integer,Integer> entry: shortest.entrySet()){
            minCost = Math.max(minCost,entry.getValue());
        }
        return (shortest.size() != n)? -1 : minCost;
    }
}