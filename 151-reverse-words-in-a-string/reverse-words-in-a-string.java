class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int L = words.length-1;
        while(L>=0){
            sb.append(words[L]);
            if(L>0) sb.append(" ");
            L--;
        }
        return sb.toString();
    }
}