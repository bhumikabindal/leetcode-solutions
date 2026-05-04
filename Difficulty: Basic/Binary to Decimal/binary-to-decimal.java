// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        
int p2=1;
int num=0;
int len=b.length();
for(int i=len-1;i>=0;i--){
if(b.charAt(i)=='1'){
    num+=p2;
}
p2=p2*2;
}
// System.out.println("decimal conversion " + num);
return num;
    }
}