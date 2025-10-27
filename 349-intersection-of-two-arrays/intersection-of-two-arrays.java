class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        int[] resultarr = new int[result.size()];
        int idx =0;
            for(int num: result){
                resultarr[idx++] = num;
            }
            return resultarr;
        }
        
        
    
}