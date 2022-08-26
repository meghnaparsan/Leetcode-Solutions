class Solution {
    public int uniquePaths(int m, int n) {
        int [][] path = new int [m][n];
        
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                if (row == 0 || column == 0) {
                    path [row][column] = 1;
                }
                
                else {
                    path [row][column] = path [row - 1][column] + path [row][column - 1];
                }
            }
        }
        
        return path [m - 1][n - 1];
    }
}