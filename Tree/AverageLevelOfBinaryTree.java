
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List <Double> result = new ArrayList <>();
        averageOfLevelOrder (root, result);
        return result;
    }
    
    private void averageOfLevelOrder (TreeNode root, List <Double> result) {
        if (root == null) {
            return;
        }
        
        List <TreeNode> parent = new ArrayList <>();
        parent.add (root);
        
        while (parent.size() > 0) {
            double total = 0;
            for (TreeNode node : parent) {
                total += node.val;
            }
            
            total = total / parent.size();
            result.add (total);
            
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
    }
}
