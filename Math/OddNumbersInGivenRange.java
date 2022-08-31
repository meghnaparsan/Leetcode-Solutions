class Solution {
    public int countOdds(int low, int high) {
        if ((low & 1) == 0 && (high & 1) == 0) {
            return (high - low) >> 1;
        }
        
        if ((low & 1) == 1 || (high & 1) == 1) {
            return ((high - low) >> 1) + 1;
        }

        
        return 0;
    }
}