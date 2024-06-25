class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] parts = sentence.split(" ");

        for(int i = 0; i<parts.length; i++){

            if(parts[i].startsWith(searchWord)){
                return i+1;
            }
        }

        return -1;
    }
}