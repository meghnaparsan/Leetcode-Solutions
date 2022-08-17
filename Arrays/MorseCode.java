class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morseCode = new String [] {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        HashSet <String> result = new HashSet <>(); 
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char token : word.toCharArray()) {
                code.append (morseCode [token - 'a']);
            }
            result.add (code.toString());
        }
        return result.size();
    }

}