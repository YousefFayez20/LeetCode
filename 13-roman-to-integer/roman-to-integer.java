class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int number = 0;
        char prev = s.charAt(0);
        for(char c : s.toCharArray()){
            number += map.get(c);
            if(map.get(c) > map.get(prev)){
                number -=map.get(prev)*2;
            }
            prev = c;
        }
        return number;        
    }
}