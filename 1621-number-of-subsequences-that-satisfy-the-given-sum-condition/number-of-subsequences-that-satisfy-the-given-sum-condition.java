class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int L = 0;
        int R = nums.length-1;
        int mod = 1_000_000_007;
        int n = nums.length;

        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        int numSubs=0;
        while(L<=R){
            int sum =nums[L] + nums[R];
            if(sum <= target){
                numSubs = (numSubs + pow2[R - L]) % mod;
                L++;
            }
            else{
                R--;
            }
        }
        return numSubs;
    }
}