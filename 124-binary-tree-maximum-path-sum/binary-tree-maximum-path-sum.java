class Solution {
    int maxi = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        height(root);
        return maxi;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;

        int l = Math.max(0, height(root.left));
        int r = Math.max(0, height(root.right));

        // Check if path passing through this node is maximum
        maxi = Math.max(maxi, root.val + l + r);

        // Return max gain including this node
        return root.val + Math.max(l, r);
    }
}