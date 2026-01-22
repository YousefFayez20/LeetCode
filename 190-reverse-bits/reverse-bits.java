class Solution {
    public int reverseBits(int n) {
        int result =0;
        for(int i = 0;i<32;i++){
            int b = (n>>i) & 1;
            result |= (b << (31-i));
        }
        return result;
    }
}