class Solution {
    public boolean isSubsequence(String s, String t) {
        int pointer1 = 0;
        int pointer2 = 0;
        
        while (pointer1 < s.length() && pointer2 < t.length()) {
            char token1 = s.charAt (pointer1);
            char token2 = t.charAt (pointer2);
            
            if (token1 == token2) {
                pointer1++;
                pointer2++;
            }
            
            else {
                pointer2++;
            }
        }
        
        return pointer1 == s.length();
    }
}