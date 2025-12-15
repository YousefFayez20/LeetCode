class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indecies = new int[2];
        int L=0;
        int R = numbers.length -1;
        while(L<R){
            if(numbers[R]+numbers[L] == target){
                indecies[0] = L+1;
                indecies[1] = R+1;
                return indecies;
            }else if(numbers[R]+numbers[L] > target){
                R--;
            }else{
                L++;
            }
        }
        return indecies;
    }
}