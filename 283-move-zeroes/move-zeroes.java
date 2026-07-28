class Solution {
    public void print(int n,int[] nums){
        for( int i=0;i<n;i++){
        System.out.print(nums[i]);
     }
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
       int i,temp;
       int j=-1;
       for(i=0;i<n;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
       }
       if(j==-1){
       print(n,nums);
       return;
       }
       // from that j find the first non zero element
       for(i=j+1;i<n;i++){
        if(nums[i]!=0){
            // swap
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;

        }
       }
     print(n,nums);
     return;
    }
}