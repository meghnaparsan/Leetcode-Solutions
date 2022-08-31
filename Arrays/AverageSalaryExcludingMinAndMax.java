class Solution {
    public double average(int[] salary) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        double total = 0;
        
        for (int num : salary) {
            if (num > maximum) {
                maximum = num;
            }
            
            if (num < minimum) {
                minimum = num;
            }
            
            total += num;
        }
        
        total = total - (minimum + maximum);
        return total / (salary.length - 2);
    }
}