class Solution {
    public void r(int[] nums,int s,int e){
           while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
    nums[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
         k=k%n;
        r(nums,0,n-1);
        r(nums,0,k-1);
        r(nums,k,n-1);
    }
}