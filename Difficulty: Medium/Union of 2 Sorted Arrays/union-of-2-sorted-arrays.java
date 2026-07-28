class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here

        ArrayList<Integer> ans=new ArrayList<>();
int i=0;
int j=0;
        int al=a.length;
        int bl=b.length;
       while(i<al && j<bl){
           if(a[i]<b[j]){
               if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]){
                   ans.add(a[i]);
               }
               i++;
           }
                      else if(a[i]>b[j]){
               if(ans.size()==0 || ans.get(ans.size()-1)!=b[j]){
                   ans.add(b[j]);
               }j++;
           }
           else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=b[j]){
                   ans.add(b[j]);
                   
               
           }
           i++;
                   j++;
       }
    }
    while(i<al){
        if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]){
                   ans.add(a[i]);
                  
    } i++;
}
while(j<bl){
    if(ans.size()==0 || ans.get(ans.size()-1)!=b[j]){
                   ans.add(b[j]);
               }j++;
}
   return ans; 
}
    
}