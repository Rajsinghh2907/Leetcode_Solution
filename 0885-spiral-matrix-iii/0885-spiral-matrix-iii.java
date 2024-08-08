class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int totalCells = rows * cols;
        int[][] result = new int[totalCells][2];
        int[] directions = {0, 1, 0, -1, 0}; // right, down, left, up
        
        int x = rStart, y = cStart;
        int steps = 0, d = 0, idx = 0;
        
        result[idx++] = new int[]{x, y};
        
        while (idx < totalCells) {
            // Only increase steps when the direction changes to right or left
            if (d == 0 || d == 2) steps++;
            for (int i = 0; i < steps; i++) {
                x += directions[d];
                y += directions[d + 1];
                if (x >= 0 && x < rows && y >= 0 && y < cols) {
                    result[idx++] = new int[]{x, y};
                }
            }
            // Change direction
            d = (d + 1) % 4;
        }
        
        return result;
    }
}