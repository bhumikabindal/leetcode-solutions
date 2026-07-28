class Solution {
    public void rotate(int[] nums, int k) {
        // brute force
        int n=nums.length;
        k=k%n;
        int sl=n-k;
        int ss=k;
        int[] arr=new int[n];
        for(int i=0;i<k;i++ ){
            arr[i]=nums[sl];
            sl++;
        }
        int index=0;
        for(int i=k;i<n;i++){

            arr[i]=nums[index];
            index++;
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
            }

    }
}