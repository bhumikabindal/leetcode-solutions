class Solution {
    public int func(String s,int k){
        int l=0,r=0,distinct=0,count=0;
        int[] hash=new int[3];
        while(r<s.length()){
            if(hash[s.charAt(r)-'a']==0){
                distinct++;
            }
            hash[s.charAt(r)-'a']++;
            while(distinct>k){
                hash[s.charAt(l)-'a']--;
             if(hash[s.charAt(l)-'a']==0)distinct--;
                l=l+1;
            }
            count=count+(r-l+1);
r++;        }
        return count;
    }
    public int numberOfSubstrings(String s) {
        int n=s.length();
        // int total=n*(n+1)/2;
        return func(s,3)-func(s,2);
    }
}