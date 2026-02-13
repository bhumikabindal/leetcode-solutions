/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag=false;
        Queue <TreeNode> q=new LinkedList<>();
        // TreeNode start=root;
             List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        q.add(root);
   
        
        Stack<Integer> st=new Stack<>();
        int idx=0;
        while(!q.isEmpty()){
         int size=q.size();
         List<Integer> level=new ArrayList<>();
         for(int i=0;i<size;i++){
            TreeNode el=q.peek();
            q.remove();
if(flag==true){
st.push(el.val);
}
else{
level.add(el.val);
}
            if(el.left!=null)q.add(el.left);
            if(el.right!=null)q.add(el.right);


         }
         if(flag==true){
while(!st.isEmpty()){
    level.add(st.pop());
}
}
result.add(level);
flag=!flag;
        }
    return result;  
    }
    }
