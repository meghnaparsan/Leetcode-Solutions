class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 1;
        
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int column = 0; column < accounts [row].length; column++) {
                sum += accounts [row][column];
            }
            maximum = Math.max (maximum, sum);
        }
        return maximum;
    }
}