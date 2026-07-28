class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:a){
            set.add(x);
        }
        for(int y:b){
            set.add(y);
        }
        for(int e:set){
            ans.add(e);
        }
        return ans;
    }
}