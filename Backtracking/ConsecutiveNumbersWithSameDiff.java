class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List <Integer> result = new ArrayList <>();
        createResult (new StringBuilder (), n, k, result);
        int [] resultArray = new int [result.size()];
        for (int index = 0; index < result.size(); index++) {
            resultArray [index] = result.get (index);
        }
        
        return resultArray;
    }
    
    private void createResult (StringBuilder temp, int digitCount, int diff, List <Integer> result) {
        //Found a digit
        if (temp.length() == digitCount) {
            if(temp.charAt (0) == '0') {
                return;
            }
            
            result.add (Integer.valueOf (temp.toString()));
            return;
        }
        
        for (int index = 0; index <= 9; index++) {
            
            //Check difference
            if (temp.length() >= 1) {
                int num1 = Integer.parseInt (String.valueOf (temp.charAt (temp.length() - 1)));
                int num2 = index;
                
                if (Math.abs (num1 - num2) == diff) {
                    temp.append (String.valueOf (index));
                    createResult (temp, digitCount, diff, result);
                    temp.deleteCharAt (temp.length() - 1);
                }
            }
            
            else {
                temp.append (String.valueOf (index));
                createResult (temp, digitCount, diff, result);
                temp.deleteCharAt (temp.length() - 1);
            }
        }        
    }
}
