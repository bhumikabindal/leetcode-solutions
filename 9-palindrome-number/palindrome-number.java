class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int ld;
        int check=x;
        if(x<0)return false;
      while(x>0){
      ld=x%10;
       if(ans>Integer.MAX_VALUE/10 || ans==Integer.MAX_VALUE/10 && ld>7){
              return false;
            }
                      else if(ans<Integer.MIN_VALUE/10 || ans==Integer.MIN_VALUE/10 && ld<-8){
              return false;
            }
      ans=(ans*10)+ld;
      x=x/10;
      }
      return ans==check;
      
    }
}