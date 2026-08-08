class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int ld;
        int check=x;
      while(x>0){
      ld=x%10;
      ans=(ans*10)+ld;
      x=x/10;
      }
      if(ans==check){
        return true;
      }


        return false;
    }
}