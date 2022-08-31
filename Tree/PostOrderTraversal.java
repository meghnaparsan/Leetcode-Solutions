//Recursive
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //Left, Right, Root
        List <Integer> result = new ArrayList <Integer>();
        postOrder (result, root);
        return result;
    }
    
    private void postOrder (List <Integer> result, TreeNode root) {
        if (root != null) {
            postOrder (result, root.left);
            postOrder (result, root.right);
            result.add (root.val);
        }
    }
}