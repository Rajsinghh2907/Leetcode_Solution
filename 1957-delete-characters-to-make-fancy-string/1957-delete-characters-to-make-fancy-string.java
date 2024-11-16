class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1; // Keeps track of consecutive character occurrences
        
        for (int i = 0; i < s.length(); i++) {
            // Add the current character to the result
            sb.append(s.charAt(i));

            // Check the next character if within bounds
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                if (count == 3) {
                    sb.deleteCharAt(sb.length() - 1); // Remove the last character if it's the third consecutive
                    count--; // Reset count for third character
                }
            } else {
                count = 1; // Reset the count for a new character
            }
        }
        
        return sb.toString();
    }
}
