class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack <String> stack = new Stack<String>();
        
        for (int index = 0; index < tokens.length; index++) {
            String token = tokens [index];
            if (token.equals ("+") || token.equals ("-") 
                || token.equals ("/") || token.equals ("*")) {
                int token1 = Integer.valueOf (stack.pop());
                int token2 = Integer.valueOf (stack.pop());

                if (token.equals ("+")) {
                    result = token1 + token2;
                }
                
                if (token.equals ("-")) {
                    result = token2 - token1;
                }
                
                if (token.equals ("*")) {
                    result = token1 * token2;
                }
                
                if (token.equals ("/")) {
                    result = token2 / token1;
                }
                
                stack.push (String.valueOf (result));
            }
            
            else {
                stack.push (token);
            }
        }
        
        return Integer.valueOf (stack.pop());
        
    }
}