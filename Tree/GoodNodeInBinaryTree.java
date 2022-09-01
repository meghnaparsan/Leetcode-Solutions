class Solution {
    int good;
    public int goodNodes(TreeNode root) {
        good = 0;
        traverseTree (root, Integer.MIN_VALUE);
        return good;
    }
    
    private void traverseTree (TreeNode root, int max) {
        if (root != null) {
            if (root.val >= max) {
                good++;
            }
            max = Math.max (max, root.val);
            traverseTree (root.left, max);
            traverseTree (root.right, max);
        }
    }
}