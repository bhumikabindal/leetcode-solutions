class Solution {
    public int func(int[] nums,int goal){
        if(goal<0)return 0;
int l=0,r=0,count=0,sum=0;

while(r<nums.length){
    sum=sum+nums[r];
    while(sum>goal){
        sum-=nums[l];
        l=l+1;
    }
    if(sum<=goal){
        count+=(r-l+1);
    }
    r++;
}return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return (func(nums,goal)-func(nums,goal-1));
    }
}