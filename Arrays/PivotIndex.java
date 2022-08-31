class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        
        int leftSum = 0;
        for (int index = 0; index < nums.length; index++) {
            if (leftSum == total - leftSum - nums [index]) {
                return index;
            }
            
            leftSum += nums [index];
        }
        
        return -1;
    }
}