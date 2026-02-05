// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int e=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=e;
    }
}