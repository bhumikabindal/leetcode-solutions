class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n=arr.length;
      
       LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:set){
            ans.add(num);
        }
        return ans;
    }
}
