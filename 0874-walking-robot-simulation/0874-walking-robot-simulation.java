class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
         // Create a set to store obstacle positions
        HashSet<String> obstacleSet = new HashSet<>();
        for (int[] obs : obstacles) {
            String key = obs[0] + "_" + obs[1];
            obstacleSet.add(key);
        }

        int x = 0;
        int y = 0;
        int maxdis = 0;

        // Initial direction: North (represented by (0, 1))
        int[] dir = {0, 1};

        for (int cmd : commands) {
            if (cmd == -2) { // Turn left 90 degrees
                dir = new int[]{-dir[1], dir[0]};
            } else if (cmd == -1) { // Turn right 90 degrees
                dir = new int[]{dir[1], -dir[0]}; // Corrected direction update
            } else {
                for (int step = 0; step < cmd; step++) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    String nextKey = newX + "_" + newY;

                    if (obstacleSet.contains(nextKey)) {
                        break; // Stop if obstacle encountered
                    }

                    x = newX;
                    y = newY;
                }
            }

            // Calculate squared Euclidean distance from the origin
            maxdis = Math.max(maxdis, x * x + y * y);
        }

        return maxdis;
    }
}