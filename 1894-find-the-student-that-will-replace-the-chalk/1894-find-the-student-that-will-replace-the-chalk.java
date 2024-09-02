class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        long sum = 0;
        for (int c : chalk) {
            sum += c;
        }

        // Step 2: Reduce k using modulo to get the remaining chalk after full rounds
        k %= sum;

        // Step 3: Iterate through the array to find the first student who can't use the chalk
        int i = 0;
        while (true) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
            i++;
        }
    }
}