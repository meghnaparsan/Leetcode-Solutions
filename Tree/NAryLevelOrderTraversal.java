class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List <List <Integer>> result = new ArrayList <>();
        levelOrder (root, result);
        return result;
    }
    
    private void levelOrder (Node root, List <List<Integer>> result) {
        if (root == null) {
            return;
        }
        
        List <Node> parent = new ArrayList <>();
        parent.add (root);
        
        while (parent.size() > 0) {
            List <Integer> temp = new ArrayList <>();
            for (Node node : parent) {
                temp.add (node.val);
            }
            
            result.add (new ArrayList <> (temp));
            List <Node> children = parent;
            parent = new ArrayList <>();
            
            for (Node node : children) {
                if (node.children.size() > 0) {
                    for (Node nodeChild : node.children) {
                        parent.add (nodeChild);
                    }
                }
            }
        }
    }
}