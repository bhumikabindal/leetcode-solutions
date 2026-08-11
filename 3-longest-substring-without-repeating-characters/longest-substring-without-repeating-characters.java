class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int maxlen=0;
        int l=0,r=0;
        int len;
        int n=s.length();
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}