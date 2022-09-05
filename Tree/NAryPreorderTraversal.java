class Solution {
    public List<Integer> preorder(Node root) {
        List <Integer> result = new ArrayList <>();
        Stack <Node> stack = new Stack <>();
        stack.push (root);
        preOrder (root, result, stack);
        return result;
    }
    
    private void preOrder (Node root, List <Integer> result, Stack <Node> stack) {
        if (root == null) {
            return;
        }
        
        Node current = stack.pop();
        result.add (current.val);
        
        for (Node node : current.children) {
            stack.push (node);
            preOrder (node, result, stack);
        }
        
    }
}