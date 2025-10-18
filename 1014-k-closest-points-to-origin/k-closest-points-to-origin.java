class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> {return Double.compare(calculateDistance(a) , calculateDistance(b));});
        for(int[] point : points){
                pq.add(point);
        }
        int[][] list = new int[k][2];
        for(int i=0;i<k;i++){
            int[] point = pq.poll();
            list[i][0] = point[0];
            list[i][1] = point[1];
        }
        return list;
    }
    public double calculateDistance (int[] x){
        return Math.sqrt(x[0]*x[0] + x[1]*x[1]);
    }
}