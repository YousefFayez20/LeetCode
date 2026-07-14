class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int L1 =0;
    int L2 =0;
    int size = m;
    while(L1<nums1.length && L2 <n){
        if(nums1[L1]<=nums2[L2]){
            L1++;
        }else{
            for(int i = nums1.length-2;i>=L1;i--){
                nums1[i+1] = nums1[i];
            }
            nums1[L1]=nums2[L2];
            L1++;
            L2++;
            size++;
        }
    }
    while(L2 < n){
        nums1[size] = nums2[L2];
        size++;
        L2++;
    }
    }
}