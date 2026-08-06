class Solution {
    public int smallestNumber(int n) {
        int  num=n;
        int bits=0;
        while(num>0){
         num=num>>1;
         bits++;
        }
      
        for(int i=0;i<bits;i++){
           n=n|(1<<i);
        }
        return n;
    }
}