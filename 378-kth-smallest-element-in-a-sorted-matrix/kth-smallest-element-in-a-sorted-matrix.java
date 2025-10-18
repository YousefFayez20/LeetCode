class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int[] row : matrix){
            for(int x : row){
                minHeap.add(x);
                if(minHeap.size() > k){
                    minHeap.poll();
                }
                
            }
        }
       
        return minHeap.poll();
    }
}