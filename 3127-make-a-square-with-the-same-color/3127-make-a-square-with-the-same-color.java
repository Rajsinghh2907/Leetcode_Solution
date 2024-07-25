class Solution {
    public boolean canMakeSquare(char[][] grid) {
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int bCount = 0;
                int wCount = 0;

                // Count 'B' and 'W' in the current 2x2 subgrid
                for (int x = i; x < i + 2; x++) {
                    for (int y = j; y < j + 2; y++) {
                        if (grid[x][y] == 'B') {
                            bCount++;
                        } else if (grid[x][y] == 'W') {
                            wCount++;
                        }
                    }
                }

                // Check if we can make this 2x2 subgrid uniform by changing at most one cell
                if (bCount >= 3 || wCount >= 3) {
                    return true;
                }
            }
        }

        return false;
    }
}