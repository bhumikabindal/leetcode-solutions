class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int count=0;
        int prefsum=0;
        for(int num:nums){
         prefsum+=num;
        
          if(mpp.containsKey(prefsum-k)){
            count+=mpp.get(prefsum-k);
          }
           mpp.put(prefsum,mpp.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
}