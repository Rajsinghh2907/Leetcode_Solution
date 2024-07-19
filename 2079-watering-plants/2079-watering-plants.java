class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int currentWater = capacity;
        int n = plants.length;

        for (int i = 0; i < n; i++) {
            if (currentWater >= plants[i]) {
                // Water the plant
                currentWater -= plants[i];
                steps++;
            } else {
                // Go back to the river to refill and come back
                steps += (i * 2) + 1;
                currentWater = capacity - plants[i];
            }
        }

        return steps;
    }
}