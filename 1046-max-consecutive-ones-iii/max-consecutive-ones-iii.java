class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0;
        int maxlen=0,len=0;
        int zeros=0;
        while(r<nums.length){
            if(nums[r]==0)zeros++;
            if(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                len=r-l+1;
                maxlen=Math.max(maxlen,len);

            }
            r++;
        }
        return maxlen;
    }
}