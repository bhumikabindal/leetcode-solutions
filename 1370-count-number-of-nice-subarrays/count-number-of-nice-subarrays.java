class Solution {
      public int func(int nums[],int k){
        int l=0,r=0,count=0,ans=0;
        while(r<nums.length){
            if((nums[r]%2)!=0)count=count+1;
            while(count>k){
                if((nums[l]%2)!=0)count=count-1;
                l=l+1;
            }
            if(count<=k){
                ans=ans+(r-l+1);
            }
            r++;
        }
        return ans;
      }
    public int numberOfSubarrays(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
}