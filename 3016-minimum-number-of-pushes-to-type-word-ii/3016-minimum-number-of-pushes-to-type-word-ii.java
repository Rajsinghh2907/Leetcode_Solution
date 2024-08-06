class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> sortedChars = new ArrayList<>(freq.keySet());
        Collections.sort(sortedChars, Comparator.comparing(freq::get).reversed());

        int keyPresses = 0;
        int keyPosition = 1;
        int keyNumber = 2;

        for (char ch : sortedChars) {
            keyPresses += freq.get(ch) * keyPosition;
            if (keyNumber < 9) {
                keyNumber++;
            } else {
                keyNumber = 2;
                keyPosition++;
            }
        }
         return keyPresses;
    }
}