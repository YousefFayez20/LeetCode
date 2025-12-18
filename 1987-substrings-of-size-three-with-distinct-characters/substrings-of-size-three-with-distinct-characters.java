class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> substring = new HashMap<>();
        if(s.length()<3) return 0;
        for(int i = 0;i<3;i++){
            substring.put(s.charAt(i),substring.getOrDefault(s.charAt(i),0) +1);
        }
        int count =0;
        if(substring.size()==3) count++;
        for(int i=3;i<s.length();i++){
            substring.put(s.charAt(i-3),substring.getOrDefault(s.charAt(i-3),0) -1);
            if(substring.get(s.charAt(i-3)) <= 0) substring.remove(s.charAt(i-3));
            substring.put(s.charAt(i),substring.getOrDefault(s.charAt(i),0) +1);

           if(substring.size()==3) count++;


        }
        return count;
    }
}