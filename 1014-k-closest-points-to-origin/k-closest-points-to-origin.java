class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //we will make priority queue with a comparator based on  Euclidean distance
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                return Double.compare(getDistance(a), getDistance(b));
            });
            for(int i = 0;i<points.length;i++){
               pq.add(points[i]);
            }
            
            int[][] Karr = new int[k][2];
            for(int i = 0;i<k;i++){
                Karr[i] = pq.poll();
            }


        
        return Karr;
        
    }
    private double getDistance(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }
}