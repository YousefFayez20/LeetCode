class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        int Rneedle=0;
        for(int L=0;L<haystack.length();L++){
            if(Rneedle < needle.length() && haystack.charAt(L) == needle.charAt(Rneedle)){
                Rneedle++;
                
                 if(Rneedle == needle.length()){
                index = L - Rneedle +1;
                break;
            }
            }else{
                if(Rneedle>0){
                    L = L - Rneedle ;
                    Rneedle =0;
                }
            }
        }

        return index;
    }
}