class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        
        for (int num : nums) {
            
            int count = 0;
            while (num != 0) {
                num = num / 10;
                count++;
            }
            
            evenCount = count % 2 == 0 ? evenCount + 1 : evenCount;
        }
        
        return evenCount;
    }
}