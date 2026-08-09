class Solution {
    public int countPrimes(int n) {
        int[] prime=new int[n];
        int l=prime.length;
        for(int i=2;i<l;i++){
          prime[i]=1;
        }
        for(int i=2;i*i<l;i++){
            if(prime[i]==1){
                for(int j=i*i;j<l;j=j+i){
                    prime[j]=0;
                }
            }
        }
        int count=0;
        for(int i=2;i<l;i++)if(prime[i]==1)count++;
        return count;
    }
}