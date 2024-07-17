class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> hs = new HashSet<>();
        int count = 0;

        for(char x : allowed.toCharArray()) {
            hs.add(x);
        }

        for(String word: words){
            if(isAllowed(word, hs)){
                count++;
            }
        }

        return count;
    }

    public static boolean isAllowed(String word, Set<Character> hs){
        for (char c : word.toCharArray()) {
            if (!hs.contains(c)) {
                return false;
            }
        }
        return true;
    }
}