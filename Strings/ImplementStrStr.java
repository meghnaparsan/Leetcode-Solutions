class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        
        int index1 = 0;
        int index2 = 0;
        
        while (index1 < haystack.length() && index2 < needle.length()) {
            char token1 = haystack.charAt (index1);
            char token2 = needle.charAt (index2);
            
            if (token1 == token2) {
                index1++;
                index2++;
            }
            
            else {
                index1 = index1 - index2 + 1;
                index2 = 0;
            }
        }
        
        if (index2 == needle.length()) {
            return index1 - index2;
        }
        
        return -1;
    }
}