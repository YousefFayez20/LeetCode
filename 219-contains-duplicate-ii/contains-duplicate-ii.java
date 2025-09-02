class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //create a window of hash sets to store window elements
        HashSet<Integer> window = new HashSet<>();
        int L = 0;
        for(int R = 0;R<nums.length; R++){
            if(R-L  > k ){
                window.remove(nums[L]);
                //if the right moved to index more that the k , remove L element
                L++;
            }
            if(window.contains(nums[R])){
                return true;

            }
            window.add(nums[R]);
        }
        return false;
        
    }
}