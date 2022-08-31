//Recursive Solution
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //Root, left, right
        List <Integer> result = new ArrayList <Integer>();
        preOrder (result, root);
        return result;
    }
    
    private void preOrder (List <Integer> result, TreeNode root) {
        if (root != null) {
            result.add (root.val);
            preOrder (result, root.left);
            preOrder (result, root.right);
        }
    }
}

//Iterative
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack <TreeNode> stack = new Stack <TreeNode>();
        List <Integer> result = new ArrayList <>();
        
        while (true) {
            while (root != null) {
                stack.push (root);
                result.add (root.val);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                TreeNode current = stack.pop();
                root = current.right;
            }
            
            else {
                break;
            }
        }
        
        return result;
        
    }
}