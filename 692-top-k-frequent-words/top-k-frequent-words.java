class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.getValue()==b.getValue()){
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue() - a.getValue();
            }
        );
        pq.addAll(map.entrySet());
        List<String> Kwords = new ArrayList<>();
        for(int i = 0;i<k;i++){
            Kwords.add(pq.poll().getKey());
        }
        return Kwords;
   
    }
}