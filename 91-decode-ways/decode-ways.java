class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] dp =new int[s.length()+1];
        dp[0] =1;
        dp[1] =1;
        for(int i=2;i<dp.length;i++){
            int OneNumber = s.charAt(i-1) -'0';
            int twoNumbers = Integer.parseInt(s.substring(i - 2, i));
            if(OneNumber !=0 ){
                dp[i] +=dp[i-1];
                
            }
            if(twoNumbers >= 10 && twoNumbers <=26){
                    dp[i] += dp[i - 2];
                }

        }
        return dp[s.length()];
        
    }
}