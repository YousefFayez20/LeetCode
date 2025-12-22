class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int L = 0;
        int R = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        while(L<g.length && R<s.length){
            if(s[R]>=g[L]){
                count++;
                L++;
            }
            R++;
        }
        return count;

    }
}