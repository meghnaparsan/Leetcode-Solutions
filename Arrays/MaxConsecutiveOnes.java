class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int count = 0;
        
        for (int index = 0; index < nums.length; index++) {
            if (nums [index] == 0) {
                maximum = Math.max (count, maximum);
                count = 0;
            }
            
            else {
                count++;
            }
        }
        
        return Math.max(maximum, count);
    }
}