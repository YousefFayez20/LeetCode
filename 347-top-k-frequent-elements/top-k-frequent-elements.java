class Solution {
 
    public int[] topKFrequent(int[] nums, int k) {
        /*
        make a hashmap to keep track of all values and frequencies
        make a frequency array of 100000 elements
        index is key, value of index is value
        return the first k elements
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>heap = new PriorityQueue<>(Map.Entry.comparingByValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(heap.size()<k){
                heap.offer(entry);
            }else if(entry.getValue() > heap.peek().getValue()){
                heap.poll();
                heap.offer(entry);
            }
        }
         int[] Karr = new int[k];
         for(int i = 0;i<k;i++){
            Karr[i] = heap.poll().getKey();
         }
         return Karr;

        /*
        int[] arr = new int[100000][];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr[entry.getKey()] = entry.getValue();
        }
        Array.sort(arr, Collections.reverseOrder());
       
        for(int i = 0;i<k;i++){
            Karr[i] = arr
        }*/
        
    }
}

/** 
//freq array to keep track of number
        int[] arr = new int[10*10*10*10];
        for(int i = 0; i < nums.length;i++){
            arr[nums[i]]++;
        }
         Arrays.sort(arr);
        
        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int[] karr = new int[k];
        for(int i =0 ;i<k;i++){
            karr[i] = arr[i];
        }
        return karr;

*/