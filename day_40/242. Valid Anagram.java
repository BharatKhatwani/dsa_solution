class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false; 
        }

        int[] charCount = new int[26]; 

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++; 
        }

        for (char c : t.toCharArray()) {
            charCount[c - 'a']--; 
        }

       
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}