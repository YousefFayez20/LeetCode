class Solution {
    public void moveZeroes(int[] nums) {
        int zero =0;
        int nzero =0;
        while(zero<nums.length &&nzero<nums.length ){
            if(nums[zero] !=0) zero++;
            else if(nums[zero] == 0 &&nums[nzero]==0) nzero++;
            else if(nums[zero] == 0 &&nums[nzero]!=0 && zero<nzero){
                int temp = nums[zero];
                nums[zero] = nums[nzero];
                nums[nzero] = temp;
            }else if(nums[zero] == 0 &&nums[nzero]!=0 && zero>=nzero){
                nzero++;
            }else{
                zero++;
            }
        }

    }
}