class Solution {
    public int func(int[]nums,int k){
             int distinct=0,len=0,count=0;
     int l=0,r=0;
     HashMap<Integer,Integer> mpp=new HashMap<>();
     while(r<nums.length)  {
        if(!mpp.containsKey(nums[r]))distinct++;
        mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
        while(distinct>k){
        mpp.put(nums[l],mpp.get(nums[l])-1);
        if(mpp.get(nums[l])==0){
            mpp.remove(nums[l]);
            distinct--;
        } l=l+1;
        }
        if(distinct<=k){
            count=count+(r-l+1);
        }

      

        r++;
     } 
     return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k<=0)return 0;
return func(nums,k)-func(nums,k-1);
    }
}