class NumArray {
//we will make an array of prefix sum
//range:(2,5) = prefix[5] - prefix[1]
int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        int total = 0;
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
            nums[i] = total;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return this.nums[right] ;
        }else{
            return this.nums[right] - this.nums[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */