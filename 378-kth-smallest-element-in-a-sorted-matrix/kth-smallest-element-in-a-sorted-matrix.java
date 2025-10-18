class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
        for(int[] row : matrix){
            for(int x : row){
                minHeap.add(x);
                
            }
        }
        for(int i=0;i<k-1;i++){
        minHeap.poll();
        }
        return minHeap.poll();
    }
}