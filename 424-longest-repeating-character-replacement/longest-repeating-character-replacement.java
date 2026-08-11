class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxfreq=0;
        HashMap<Character,Integer> mpp=new HashMap<>();
        while(r<s.length()){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            maxfreq=Math.max(maxfreq,mpp.get(s.charAt(r)));
            while((r-l+1)-maxfreq>k){
              mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
              if(mpp.get(s.charAt(l))==0){
                mpp.remove(s.charAt(l));
              }    
              l=l+1;
            }
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,(r-l+1));
            }

            r++;
        }
return maxlen;
    }
}