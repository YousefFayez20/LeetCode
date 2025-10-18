class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //number,freq
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         Queue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(pq.size() < k){
                pq.add(entry.getKey());
            }
            else if(pq.size()>=k && entry.getValue() > map.get(pq.peek())){
                pq.poll();
                pq.add(entry.getKey());
            }
        }
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}