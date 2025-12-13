class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        int n1=0;
        int n2=0;
        for(int i=0;i<nums1.length;i++){
            if(n1<m&&n2<n&& nums3[n1]<nums2[n2]){
                nums1[i] = nums3[n1];
                n1++;
            }else if(n1<m && n2<n && nums3[n1]>=nums2[n2]){
                nums1[i] = nums2[n2];
                n2++;
            } else if(n1<m){
                nums1[i] = nums3[n1];
                n1++;
            }else{
                nums1[i] = nums2[n2];
                n2++;
            }
        }
    }
}
