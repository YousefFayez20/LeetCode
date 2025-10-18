class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int num : nums){
            if(pq.size() < k){
                pq.add(num);
            }
            else if(pq.size() >= k && num > pq.peek() ){
                pq.poll();
                pq.add(num);
            }
        }
        return pq.poll();
    }
}