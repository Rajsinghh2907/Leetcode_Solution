class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int i = 1, j = n-1;

        while (i <= j) {
            // Check if both i and j are No-Zero integers
            if (isNoZero(i) && isNoZero(j)) {
                return new int[]{i, j};
            }
            i++;
            j--;
        }
        
        // This should not happen as per problem statement guarantees
        return new int[]{};
    }
    
    // Helper function to check if a number is No-Zero
    private boolean isNoZero(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    
    }
}