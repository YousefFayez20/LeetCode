class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hasmap solution
        int[] arr =new int[2];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int result = target - nums[i];
            if(hash.containsKey(result) && hash.get(result) != i){
                arr[0] = hash.get(result);
                arr[1] = i;
                break;
            }
        }
        return  arr;
        /*
        //O(n^2) solution
        int[] index = new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }

        }
        return index;
        */
    }
}