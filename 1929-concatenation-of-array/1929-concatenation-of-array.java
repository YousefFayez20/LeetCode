class Solution {
    public int[] getConcatenation(int[] nums) {
     //use modulus
     int size = 2*nums.length;
     int [] ans = new int[size];
     for(int i = 0;i<size;i++){
        int x = i%(nums.length);
        ans[i] = nums[x];
        /**
        or
            ans[i] = nums[i];
            ans[i+size] = nums[i];        
         */
     }   
     return ans;
    }
}