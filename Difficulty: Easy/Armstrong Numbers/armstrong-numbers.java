class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int count=String.valueOf(n).length();
        int num=n;
        int sum=0;
        int ld;
        while(num>0){
            ld=num%10;
            sum=sum+(int)Math.pow(ld,count);
            num/=10;
            
        }
            
        
        return sum==n;
    }
}