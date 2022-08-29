class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <Character>();
        
        for (char token : s.toCharArray()) {
            if (token == '(' || token == '[' || token == '{') {
                stack.push (token);
            }
            
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                if (stack.peek().equals ('(') && token == ')') {
                    stack.pop();
                }
                
                else if (stack.peek().equals ('[') && token == ']') {
                    stack.pop();
                }
                
                else if (stack.peek().equals ('{') && token == '}') {
                    stack.pop();
                }
                
                else {
                    return false;
                }
                
            }
        }
        
        return stack.isEmpty();
        
    }
}