//Recursive
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //Left, Root, Right
        List <Integer> result = new ArrayList <Integer>();
        inOrder (result, root);
        return result;
    }
    
    private void inOrder (List <Integer> result, TreeNode root) {
        if (root != null) {
            inOrder (result, root.left);
            result.add (root.val);
            inOrder (result, root.right);
        }
    }
}

//Iterative
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> stack = new Stack <TreeNode>();
        List <Integer> result = new ArrayList <>();
        
        while (true) {
            while (root != null) {
                stack.push (root);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                TreeNode current = stack.pop();
                result.add (current.val);
                root = current.right;
            }
            
            else {
                break;
            }
        }
        
        return result;
    }
}