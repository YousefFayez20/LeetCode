class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3){
            return 0;
        }
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(int L= 0;L<s.length()-2;L++){
            for(int R= L;R<L+3;R++){
                set.add(s.charAt(R));
            }
            if(set.size() == 3){
                count++;
            }
            set.clear();
        }
        return count;
        
    }
}