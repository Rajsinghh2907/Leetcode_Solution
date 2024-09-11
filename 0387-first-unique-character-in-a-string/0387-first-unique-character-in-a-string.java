class Solution {
    public int firstUniqChar(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String currentChar = String.valueOf(ch);

            
            if (!s.substring(0, i).contains(currentChar) && (!s.substring(i + 1).contains(currentChar) ))  {
                return i; // Return the index of the first non-repeating character
            }
        }
        
        return -1; 
    }
}