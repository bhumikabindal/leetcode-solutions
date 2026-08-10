class Solution {
    public int lengthOfLongestSubstring(String s) {
    int[] hash=new int[256];
    int n=s.length();
    int length;
    int maxlen=0;
    for(int i=0;i<n;i++){
        Arrays.fill(hash,0);
        length=0;
        for(int j=i;j<n;j++){
           if(hash[s.charAt(j)]==1){
            break;
           }
           length=j-i+1;
           maxlen=Math.max(maxlen,length);
           hash[s.charAt(j)]=1;

        }
    }
    return maxlen;
    }
}