class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int n=nums.length;
        int length;
        int zeros;
        for(int i=0;i<n;i++){
           length=0;
           zeros=0;
           for(int j=i;j<n;j++){
            if(nums[j]==0){
                zeros++;
            }
                
                if(zeros<=k){
                    length=j-i+1;
                    maxlen=Math.max(maxlen,length);
                }
                else{
                    break;
                }
            
           }
        }
        return maxlen;
    }
}