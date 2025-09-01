class Solution {
    public void reverseString(char[] s) {
        //we will have 2 pointer one at end the other at the start
        // we will swap each pair
        if(s.length == 1){
            return;
        }
        int Left = 0;
        int Right = s.length -1;
        while(Left<Right){
            char temp = s[Left];
            s[Left] = s[Right];
            s[Right] = temp;
            Left++;
            Right--;
        }
    }
}