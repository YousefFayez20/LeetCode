class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int first = pq.poll();
        return(first-1)*(pq.poll()-1);
    }
}