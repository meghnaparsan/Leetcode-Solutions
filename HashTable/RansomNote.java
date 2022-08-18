class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] magazineCount = new int [26];
        int [] ransomCount = new int [26];

        for (char token : magazine.toCharArray()) {
            magazineCount [token - 'a']++;
        }
        
        for (char token : ransomNote.toCharArray()) {
            ransomCount [token - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            if (magazineCount [index] < ransomCount [index]) {
                return false;
            }
        }
        return true;
    }
}