class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,maxlen=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l=l+1;
            }
             if(map.size()<=2){
             maxlen=Math.max(r-l+1,maxlen);
          
             }   r++;

            

        }
        return maxlen;
    }
}