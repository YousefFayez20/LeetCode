import java.util.Collection;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> set = new HashMap<>();
        int WindowStart=0;
        int WindowSize = 0;
        int maxCount=0;
        for(int i =0;i<s.length();i++){
            set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
             maxCount = Math.max(maxCount, set.get(s.charAt(i)));
            while((i-WindowStart+1) - maxCount > k){
                set.put(s.charAt(WindowStart),set.getOrDefault(s.charAt(WindowStart),0)-1);
                WindowStart++;
            }
            WindowSize = Math.max(WindowSize,i-WindowStart+1);
        }
        return WindowSize;
        
    }
}