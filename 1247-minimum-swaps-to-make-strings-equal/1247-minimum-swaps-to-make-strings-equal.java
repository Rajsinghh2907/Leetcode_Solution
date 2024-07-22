class Solution {
    public int minimumSwap(String s1, String s2) {
        

        int countXY = 0; // first we have to count the XY in booth the given String
        int countYX = 0;
        
        // Count mismatches
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            
            if (a == 'x' && b == 'y') {
                countXY++;
            } else if (a == 'y' && b == 'x') {
                countYX++;
            }
        }
        
        // If the sum of mismatches is odd, return -1
        if ((countXY + countYX) % 2 != 0) {
            return -1;
        }
        
        // Calculate swaps
        int swaps = countXY / 2 + countYX / 2;
        if (countXY % 2 == 1) {
            swaps += 2;  // Additional swap for the leftover xy and yx mismatch
        }
        
        return swaps;
    }
}