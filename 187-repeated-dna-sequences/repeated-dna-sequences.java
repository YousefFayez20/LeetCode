class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(sb.length()>10){
                sb.deleteCharAt(0);
            }
            if(sb.length()==10){
                map.put(sb.toString(), map.getOrDefault(sb.toString(),0)+1);
            }
        }
        List<String> values = map.keySet().stream().filter(k-> map.get(k)>1).toList();
        return values;
    }
}