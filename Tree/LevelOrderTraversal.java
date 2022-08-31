class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if (root == null) {
            return new ArrayList <>();
        }
        
        List <List <Integer>> result = new ArrayList <>();
        List <TreeNode> parent = new ArrayList <>();
        parent.add (root);
        
        while (parent.size() > 0) {
            List <Integer> temp = new ArrayList <>();
            for (TreeNode node : parent) {
                temp.add (node.val);
            }

            result.add (new ArrayList <> (temp));
            List <TreeNode> children = parent; 
            parent = new ArrayList <>();
            
            for (TreeNode node : children) {
                if (node.left != null) {
                    parent.add (node.left);
                }
                
                if (node.right != null) {
                    parent.add (node.right);
                }
            }
        }
        
        return result;
    }
}