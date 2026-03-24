// class Solution {
//     public int fib(int n) {
//        if(n==0){
//         return 0;
//        } 
//        if(n==1){
//         return 1;

//        }
//        int ans=fib(n-1)+fib(n-2);
//        return ans;
//     }
// }
class Solution{
    public int fibMem(int n,int[]dp){
         if(n==0){
        return 0;
       } 
       if(n==1){
        return 1;

       }
       if(dp[n]!=-1){
        return dp[n];
       }
       dp[n]=fibMem(n-1,dp)+fibMem(n-2,dp);
       return dp[n];
    }
    public int fib(int n){
        //memorization
        //crearte dp array
        int dp[]=new int[n+1];
      
            Arrays.fill(dp,-1);
        
        return fibMem(n,dp);

    }
}
