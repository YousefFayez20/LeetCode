class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();        
        if(nums.length < 3){
            return list;
        }
        for(int i= 0;i<nums.length;i++){
            int L = i+1;
            int R = nums.length - 1;
            while(L < R){
                int sum = nums[i] + nums[L] +nums[R];
                if(sum < 0){
                    L++;
                }else if(sum > 0){
                    R--;
                }else{
                       list.add(new ArrayList<>(List.of(nums[i],nums[L],nums[R])));
                       while (L < R && nums[L] == nums[L+1]) {
                        L++;
                    } 
                     while (L < R && nums[R] == nums[R-1]) {
                        R--;
                    } 
                    L++;
                    R--;
                    
                   
                }
            }
        }
        HashSet<List<Integer>> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        return list;
        
    }
}