class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:  s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq =new PriorityQueue<>(Map.Entry.comparingByValue(Collections.reverseOrder()));
        pq.addAll(map.entrySet());
        StringBuilder x = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            int i =0;
            while(i<entry.getValue()){
                x.append(entry.getKey());
                i++;
            }

        }
        return x.toString();
        
    }
}