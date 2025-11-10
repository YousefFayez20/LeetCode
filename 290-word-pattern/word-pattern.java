class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.trim().split("\\s+");
        HashMap<Character,String> map = new HashMap<>();
        int i =0;
        for(char c : pattern.toCharArray()){
            if(!map.containsKey(c) && i<words.length &&!map.containsValue(words[i])){
                map.put(c,words[i]);
                
            }else{
                if( i >= words.length || !map.getOrDefault(c," ").equals(words[i])){
                    return false;
                }
            }
            i++;
        }
        if(i<words.length){
            return false;
        }
        return true;
        
    }
}