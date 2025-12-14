class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() ==0) return true;
        if(t.length() ==0) return false;

        int L=0;
        int R=0;
        int matches =s.length();
        while(R<t.length()){
            if(s.charAt(L) == t.charAt(R)){
                L++;
            }
            if(L == matches) return true;
            R++;
        }
        return false;
    }
}