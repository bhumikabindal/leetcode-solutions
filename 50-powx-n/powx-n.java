class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long N=n;
        if(N<0){
            x=1.0/x;
            N=-N;
        }
        while(N!=0){
            if(N%2==1){
                // if the pow is odd
                // then rmeove one one pow from there
                ans=ans*x;
                N=N-1;
            }
            else{
                N=N/2;
                x=x*x;

            }
        }
       
         return ans;
    }
}