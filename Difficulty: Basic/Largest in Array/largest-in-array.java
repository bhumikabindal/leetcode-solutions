class Solution {
    public static int largest(int[] arr) {
        // code here

        int n=arr.length;
        for(int i=0;i<n;i++){
                    boolean flag=true;
                    // whatever the elemnt htat you are icking consider it s ths largeesr
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return arr[i];
            }
            
        }
        return arr[0];
        
    }
}
