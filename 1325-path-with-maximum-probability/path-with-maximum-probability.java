class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        //construct adjlist 1: [d,w]
        HashMap<Integer, List<double[]>> adj = new HashMap<>();
        for(int i = 0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }
        //we connect the edges
        for(int i =0;i<succProb.length;i++){
            adj.get(edges[i][0]).add(new double[]{edges[i][1],succProb[i]});
            adj.get(edges[i][1]).add(new double[]{edges[i][0],succProb[i]});
        }
        //we make a map with shortest distances
        HashMap<Integer,Double> shortest = new HashMap<>();//[Node,Weight]
        //a priority queue maitaining the best distance on top
        Queue<double[]> pq = new PriorityQueue<>((a,b)-> Double.compare(b[1], a[1]));//[Node,weight] 
        pq.add(new double[]{start_node,1.0});
        while(!pq.isEmpty()){
            double[] x = pq.poll();
            int node = (int)x[0];
            double weight = x[1];
            if(shortest.containsKey(node)){
                continue;
            }
            shortest.put(node,weight);
            //add neighbors from adj HashMap<Integer, List<Integer[]>>
            for(double[] pair: adj.get(node)){
                //add neighbors to heap
                pq.add(new double[]{(int)pair[0],weight*pair[1]});
            }
        }

        return (shortest.containsKey(end_node))? shortest.get(end_node) :0.00000 ;


        
    }
}