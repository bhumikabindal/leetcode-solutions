class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int idx=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=idx){
                return idx;
            
            }
            idx++;

        }
     return idx;
    }
}