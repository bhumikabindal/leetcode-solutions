class Solution {
    public int climbStairs(int n) {
        // if(n==2){
        //     return 2;
        // }
        // if(n==1){
        //     return 1;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
            int dp[]=new int[n+1];
               Arrays.fill(dp,-1);
        return memorization(n,dp);
    }
    public int memorization(int n,int[] dp){
 
     if(n==2){
            return 2;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]=memorization(n-1,dp)+memorization(n-2,dp);
            return dp[n];
        }


    }
}