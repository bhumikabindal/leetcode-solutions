class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
                HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int count=0;
        int prefsum=0;
        for(int num:nums){
         prefsum+=num;
        
          if(mpp.containsKey(prefsum-goal)){
            count+=mpp.get(prefsum-goal);
          }
           mpp.put(prefsum,mpp.getOrDefault(prefsum,0)+1);
        }
        return count;

    }
}