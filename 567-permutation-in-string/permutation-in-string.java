class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> set1 = new HashMap<>();
        HashMap<Character,Integer> set2 = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            set1.put(s1.charAt(i),set1.getOrDefault(s1.charAt(i),0)+1);
        }
        int L =0;
        for(int R = 0 ; R< s2.length();R++){
            if(!set1.containsKey(s2.charAt(R)) ){
                if(set2.containsKey(s2.charAt(L))){
                    set2.put(s2.charAt(L),set2.getOrDefault(s2.charAt(L),0)-1);
                    if(set2.get(s2.charAt(L)) <= 0){
                        set2.remove(s2.charAt(L));
                    }
                }
                L++;
            }else{
                set2.put(s2.charAt(R),set2.getOrDefault(s2.charAt(R),0)+1);
               if((R-L+1) > s1.length()){
                if(set2.containsKey(s2.charAt(L))){
                    set2.put(s2.charAt(L),set2.getOrDefault(s2.charAt(L),0)-1);
                    if(set2.get(s2.charAt(L)) <= 0){
                        set2.remove(s2.charAt(L));
                    }
                }
                L++;
               }
                if(set1.equals(set2)){
                    return true;
                }

            }

        }
        return false;

        
    }
}