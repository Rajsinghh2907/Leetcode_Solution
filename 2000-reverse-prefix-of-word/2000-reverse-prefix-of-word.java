class Solution {
    public String reversePrefix(String word, char ch) {

        int a = word.indexOf(ch) + 1; // Here We find the position of charcter that is give (CH)
        
        if (a == 0) {
            return word; // if ch is not found in word, return the original word
        }
        
        StringBuilder sb = new StringBuilder(word.substring(0, a)); // find the Substring from where we have to find the reverse
        sb.reverse(); // reverse the string
        sb.append(word.substring(a));
        
        return sb.toString();

    }
}