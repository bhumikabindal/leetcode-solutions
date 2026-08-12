class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int prefcount=0,count=0;
        for(int num:nums){
           if((num%2)!=0){
            prefcount+=1;
           }
           if(mpp.containsKey(prefcount-k)){
            count+=mpp.get(prefcount-k);
           }
           mpp.put(prefcount,mpp.getOrDefault(prefcount,0)+1);
        }
        return count;
    }
}