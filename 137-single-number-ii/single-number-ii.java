class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        
        int count;
        for(int bitIndex=0; bitIndex<=31;bitIndex++){
       count=0;
       for(int j=0;j<n;j++){
        if((nums[j]&(1<<bitIndex))!=0){
            count++;
        }
       }
       if(count%3==1){
         ans=ans|(1<<bitIndex);
       }
        }
        return ans;
    }
}