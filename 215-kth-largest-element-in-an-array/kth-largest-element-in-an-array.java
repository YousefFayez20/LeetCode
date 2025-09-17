class Solution {
    public int findKthLargest(int[] nums, int k) {
        //priority queue to store largest k numbers
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0;i<nums.length;i++){
            if(heap.size() < k){
                heap.offer(nums[i]);
            }else if(heap.peek() <= nums[i]){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
         int KLargest = heap.peek();
        
        return heap.peek();
        
    }
}