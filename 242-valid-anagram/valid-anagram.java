class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashS = new HashMap<>();
        HashMap<Character,Integer> hashT = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            if(hashS.get(s.charAt(i)) != null){
               hashS.put(s.charAt(i), hashS.get(s.charAt(i)) + 1);
            }else{
                hashS.put(s.charAt(i), 1);
            }
            
        }
         for(int i = 0; i<t.length();i++){
            if(hashT.get(t.charAt(i)) != null){
            hashT.put(t.charAt(i), hashT.get(t.charAt(i)) + 1);}
            else{
                hashT.put(t.charAt(i), 1);
            }
        }
        if( hashT.size() != hashS.size()){
            return false;
        }
        
           for (Character c : hashS.keySet()) {
            if (!hashT.containsKey(c) || !hashT.get(c).equals(hashS.get(c))) {
                return false;
            }
        
    }
      return true;
}
}