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
    public int findHeight(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
    
    public boolean isBalanced(TreeNode root) {
        //naive approach
        //calculate the left height and right height first
        if(root==null)return true;
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        if(Math.abs(lh-rh)>1) return false;
       boolean left= isBalanced(root.left);
        boolean right=isBalanced(root.right);
        return (left && right);

        
    }
}