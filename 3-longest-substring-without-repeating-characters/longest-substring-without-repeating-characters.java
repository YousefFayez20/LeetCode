class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> visited = new HashSet<>();
        int MaxLength=0;
        int L = 0;
        for(int R = 0; R<s.length();R++){
            char c = s.charAt(R);
            while(visited.contains(c)){
                visited.remove(s.charAt(L));
                L++;
            }
            visited.add(c);
            MaxLength = Math.max(MaxLength, R-L+1);

        }
        return MaxLength;

        
    }
}