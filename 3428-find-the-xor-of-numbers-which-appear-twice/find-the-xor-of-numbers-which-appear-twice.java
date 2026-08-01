class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       int maxi=Integer.MIN_VALUE;
       int n=nums.length;
       for(int i=0;i<n;i++){
        maxi=Math.max(maxi,nums[i]);
       }
       int[] hash=new int[maxi+1];
       for(int i=0;i<n;i++){
        hash[nums[i]]++;
       }
       int xor=0;
       for(int i=0;i<hash.length;i++){
        if(hash[i]==2){
               xor^=i;
        }
       }
      return xor;
    }
}