class Solution {
    public int hammingWeight(int n) {
        int counter = 0;
        while(n >= 1){
            if((n & 0x01) == 1) counter++;
            n = n>> 1;
        }
        return counter;
        
    }
}