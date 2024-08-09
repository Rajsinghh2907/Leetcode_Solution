class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
        int count = 0;

        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] freq = new int[16]; // Frequency array to check if numbers 1-9 are used once.

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) return false; // Numbers must be between 1 and 9.
                freq[grid[i][j]]++;
            }
        }

        for (int k = 1; k <= 9; k++) {
            if (freq[k] != 1) return false; // Each number from 1 to 9 must be used once.
        }

        int sum = 15; // The sum of each row, column, and diagonal in a magic square.

        // Check rows
        for (int i = row; i < row + 3; i++) {
            if (grid[i][col] + grid[i][col + 1] + grid[i][col + 2] != sum) return false;
        }

        // Check columns
        for (int j = col; j < col + 3; j++) {
            if (grid[row][j] + grid[row + 1][j] + grid[row + 2][j] != sum) return false;
        }

        // Check diagonals
        if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != sum) return false;
        if (grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col] != sum) return false;

        return true;
    }
}