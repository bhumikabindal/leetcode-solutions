class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastSeen={-1,-1,-1};
        
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i)-'a']=i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 &&  lastSeen[2]!=-1
            ){
                int x=Math.min(lastSeen[0],lastSeen[1]);
                count+=(1+Math.min(x,lastSeen[2]));
            }

        }
        return count;
    }
}