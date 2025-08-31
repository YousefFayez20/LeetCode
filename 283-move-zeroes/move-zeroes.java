class Solution {
    
       
    public void moveZeroes(int[] nums) {
        //maintain zero pointer, non zero pointer
        int zeroP = 0;
        int NonZero = 0;
        if(nums.length == 1){
            return;
        }
        while (zeroP < nums.length){
           
            if(nums[zeroP] != 0){
                zeroP++;
                
            }
            if(nums[zeroP] == 0 && nums[NonZero] != 0 && zeroP < NonZero){
                int temp = nums[zeroP];
                nums[zeroP] = nums[NonZero];
                nums[NonZero] = temp;
                zeroP++;
                
            }
            NonZero++;
            if(NonZero >= nums.length  || zeroP >=nums.length-1){
                break;
            }
            /*
            for(int x : nums){
                System.out.print(x);
            }
            System.out.println();*/
            
        }
      
        
    }
}