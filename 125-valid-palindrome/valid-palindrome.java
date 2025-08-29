class Solution {
    public boolean isPalindrome(String s) {
        // we will have 2 pointers , one at the start and the other at the end
        //we will compare each pair, if not matched -> false, if L>R ->TRUE
       
        String x = s.toLowerCase().replaceAll("[^a-z0-9]", "");
         int L = 0;
        int R = x.length() -1;
        while(L<R){
            if(x.charAt(L) != x.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
        return true;
    }
}