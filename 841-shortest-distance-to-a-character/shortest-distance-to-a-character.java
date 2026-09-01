class Solution {
    public int[] shortestToChar(String s, char c) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c) set.add(i);
        }
        int[] arr = new int[s.length()];
        for(int i =0;i<arr.length;i++){
            arr[i] =100000;
        }
        for(int x : set){
             for(int i = 0;i<s.length();i++){
            arr[i] = Math.min(arr[i], Math.abs(x-i));
        }
        }
        return arr;
    }
}