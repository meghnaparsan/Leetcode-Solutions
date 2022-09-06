class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return pruneTreeHelper (root);
    }
    
    private TreeNode pruneTreeHelper (TreeNode root) {
        if (root == null) {
            return null;
        }
        
        root.left = pruneTreeHelper (root.left);
        root.right = pruneTreeHelper (root.right);
        
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }
}