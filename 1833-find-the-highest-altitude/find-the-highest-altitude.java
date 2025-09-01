class Solution {
    public int largestAltitude(int[] gain) {
        //construct an array of gain.length+1
        //first element = 0
        //arr[i+1] = gain[i] + arr[i]
        int[] net = new int[gain.length+1];
        net[0] = 0;
        int max = net[0];
        for(int i =0;i<net.length-1;i++){
            net[i+1] = gain[i] + net[i];
            if(net[i+1] > max){
                max = net[i+1];
            }
        }
        return max;
        
    }
}