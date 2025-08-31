class Solution {
    public int maxArea(int[] height) {
        //container =Math.min(height[L],height[R])*(L-R)
        int lengthheight = height.length;
        int maxResult =0;
        int result = 0;
        int L=0;
         int R= lengthheight - 1;
        while(L<R){
            result = Math.min(height[L],height[R])*(R-L);
            if(result>maxResult){
                maxResult = result;
            }
            if(height[L] < height[R]){
                L++;
            }else{
                R--;
            }
           
        }
        return maxResult;
        }
     
        
    
}