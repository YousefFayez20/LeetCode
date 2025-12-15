class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)
        ->{
            int cmp = Math.abs(a-x) - Math.abs(b-x);
            if (cmp !=0) return cmp;
            return a-b;
        } 
        );
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}