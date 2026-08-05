class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        if(divisor==1)return dividend;
        if(divisor==-1 && dividend==Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        boolean isPositive=true;
        if((divisor>0 && dividend<0)||(divisor<0 && dividend>0)){
      isPositive=false;
        }
        long n=Math.abs((long)dividend);
          long d=Math.abs((long)divisor);
              long ans=0;
          while(n>=d){
            int count=0;
            while(n>=(d<<count+1)){
               count++;
            }
            ans+=(1<<count);
            n-=d<<count;

          }

         
      return isPositive? (int)ans:(int) -ans;
    }
}