class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //using 2 pointers
        int L =0;
        int R = numbers.length - 1;
        int [] indecies = new int[2];
        while( L < R ){
           int result = numbers[L] + numbers[R];
            if(result > target){
                R--;
            }
            else if(result < target){
                L++;
            }
            else{
                indecies[0] = L +1;
                indecies[1] = R+1;
                break;
            }
        }
        return indecies;
        
    }
}