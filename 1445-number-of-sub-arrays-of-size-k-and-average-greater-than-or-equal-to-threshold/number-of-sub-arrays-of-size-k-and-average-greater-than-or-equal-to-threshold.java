class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    
        int count = 0;
        int L = 0;
        
        if( k == 1){
            for(int i = 0;i<arr.length;i++){
                if(arr[i] >=threshold ){
                    count++;
                }
            }
        }else{
            for(L = 0;L<arr.length - k +1 ;L++){
                int sum = arr[L];
            for(int R = L+1;R<L+k ;R++){
                sum = sum + arr[R];
                
            }
            
            if((sum/(k*1.0)) >= threshold ){
                count++;
            }
                sum = sum -arr[L];
               sum = sum - arr [L+k-1];
                
               
            
        }
        }
        
       
        /*
        for(int R = 0;R<arr.length;R++){
            if(R-L +1 > k){
                sum = sum - arr[L];
                window.remove(arr[L]);
                L++;
            }
            sum = sum + arr[R];
            window.add(arr[R]);
            if((sum/3.0) >= threshold && window.size() == 3){
                count++;
            }
            
        }*/
        return count;
    }
}