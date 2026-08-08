class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ones=0;
        int twos=0;
        for(int i=0;i<n;i++){
            ones=(ones^nums[i])& ~twos;
            twos=(twos^nums[i])& ~ones;

        }
        return ones;
    }
}