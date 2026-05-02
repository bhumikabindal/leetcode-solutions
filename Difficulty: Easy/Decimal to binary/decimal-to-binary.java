class Solution {
    static String decToBinary(int n) {
        if(n==0)return "0";
        // code here
       String res="";
       while(n>0){
           if(n%2==1)res+="1";
           else res+="0";
           n=n/2;
       }
       res=new StringBuilder(res).reverse().toString();
       return res;
    }
}