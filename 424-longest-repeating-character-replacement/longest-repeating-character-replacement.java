class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxfreq=0;
        int len;
        HashMap<Character,Integer> mpp=new HashMap<>();
        while(r<s.length()){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            maxfreq=Math.max(maxfreq,mpp.get(s.charAt(r)));
            len=r-l+1;
            if(len-maxfreq>k){
              mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
              if(mpp.get(s.charAt(l))==0){
                mpp.remove(s.charAt(l));
              }    
              l=l+1;
            }
            if(len-maxfreq<=k){
                maxlen=Math.max(maxlen,len);
            }

            r++;
        }
return maxlen;
    }
}