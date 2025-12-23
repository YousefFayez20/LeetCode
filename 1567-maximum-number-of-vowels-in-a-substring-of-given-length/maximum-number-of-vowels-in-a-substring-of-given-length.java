class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        StringBuilder sb = new StringBuilder();
        int numberOfVowels=0;
        int max = 0;
        for(int i =0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(vowels.contains(s.charAt(i))){
                numberOfVowels++;
            }
            max = Math.max(max,numberOfVowels);
            if(max == k) return k;
             if(sb.length() == k){
                if(vowels.contains(s.charAt(i-(k-1))))numberOfVowels--;
                sb.deleteCharAt(0);
            }
            
        }
        return max;
    }
}