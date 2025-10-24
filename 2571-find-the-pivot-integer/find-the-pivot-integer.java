class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        int[] prefix = new int[n+1];
        for(int i=0;i<n+1;i++){
            total +=i;
            prefix[i] = total;
        }
        
        for(int i=1;i<prefix.length;i++){
            if(prefix[i] == prefix[n] - prefix[i-1]){
                return i;
            }
        }
        return -1;
        
    }
}