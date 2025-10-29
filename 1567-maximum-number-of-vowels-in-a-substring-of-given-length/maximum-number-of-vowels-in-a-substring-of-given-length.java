class Solution {
    public int maxVowels(String s, int k) {
        int MaxCount = Integer.MIN_VALUE;
        int currentCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                currentCount++;
            }
            if(i >= k-1){
                MaxCount = Math.max(MaxCount,currentCount);
                if(s.charAt(i-(k-1)) == 'a'||s.charAt(i-(k-1)) == 'e'||s.charAt(i-(k-1)) == 'i'||s.charAt(i-(k-1)) == 'o'||s.charAt(i-(k-1)) == 'u'){
                currentCount--;
            }
            
            }

        }
        return MaxCount; 
    }
}