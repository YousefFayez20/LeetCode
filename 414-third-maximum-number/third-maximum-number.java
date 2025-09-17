class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<nums.length;i++){
            if(heap.size() < 3 && !heap.contains(nums[i])){
                heap.offer(nums[i]);
            }else if(heap.peek() < nums[i] && !heap.contains(nums[i])){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        if(heap.size() == 3){
         return heap.peek();
        }else{
            int size = heap.size();
            int x = heap.peek();
            for(int i = 0;i<size;i++){
                x = heap.poll();
            }
            return x;
        }
       
        
    }
}