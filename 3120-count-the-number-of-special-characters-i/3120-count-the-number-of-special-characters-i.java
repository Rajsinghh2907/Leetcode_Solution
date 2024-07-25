class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lowerSet = new HashSet<>();
        Set<Character> upperSet = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerSet.add(ch);
            } else if (Character.isUpperCase(ch)) {
                upperSet.add(ch);
            }
        }

        int Count = 0;
        for (char ch : lowerSet) {
            if (upperSet.contains(Character.toUpperCase(ch))) {
                Count++;
            }
        }

        return Count;
    }
}