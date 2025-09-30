class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> Possible = new HashSet<>();
        StringBuilder x = new StringBuilder();
        for(int i =0;i<s.length();i++){
            x.append(s.charAt(i));
            if( i >= k-1){
                Possible.add(x.toString());
                x.deleteCharAt(0);
            }
        }
        return Possible.size() == Math.pow(2,k);

        
    }
}