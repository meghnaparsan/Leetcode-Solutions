class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;
        int reminder = 0;
        int sum = 0;
        int num1 = 0;
        int num2 = 0;
        
        while (index1 >= 0 || index2 >= 0) {
            
            if (index1 >= 0) {
                num1 = a.charAt (index1) - '0';
            }
            
            if (index2 >= 0) {
                num2 = b.charAt (index2) - '0';
            }
            
            sum = num1 + num2 + reminder;            
            reminder = sum / 2;
            
            result.append (String.valueOf (sum % 2));
            index1--;
            index2--;
            num1 = 0;
            num2 = 0;
        }
        
        if (reminder != 0)
            result.append (String.valueOf(reminder));
        
        return result.reverse().toString();
    }
}