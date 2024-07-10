class Solution {
    public String truncateSentence(String s, int k) {
        
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for(int i = 0; i<k; i++){
            if (i > 0) {
                sb.append(" ");  // Add a space between words
            }
            sb.append(words[i]);

        }

        return sb.toString();
    }
}