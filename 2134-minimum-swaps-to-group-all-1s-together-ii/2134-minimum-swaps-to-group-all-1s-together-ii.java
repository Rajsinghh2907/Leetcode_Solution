class Solution {
    public int minSwaps(int[] nums) {
      int numOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                numOnes++;
            }
        }
        
        int n = nums.length;
        int maxOnesInWindow = 0;
        int currentOnes = 0;
        
        // Sliding window on the first `numOnes` elements
        for (int i = 0; i < numOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        maxOnesInWindow = currentOnes;
        
        // Sliding the window over the entire circular array
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == 1) {
                currentOnes--;
            }
            if (nums[(i + numOnes - 1) % n] == 1) {
                currentOnes++;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }
        
        return numOnes - maxOnesInWindow;
    }
}