class Solution {
    public int minSwaps(String s) {
        

        int maxBalance = 0;
        int balance = 0;

        // Traverse the string to find the maximum imbalance
        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else {  // c == ']'
                balance--;
            }

            // Track the maximum negative balance (imbalance)
            if (balance < 0) {
                maxBalance = Math.max(maxBalance, -balance);
            }
        }

        // The number of swaps needed is the ceiling of half the maximum imbalance
        return (maxBalance + 1) / 2;
    }
}