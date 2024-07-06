class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        
        long points = 0;
        Arrays.sort(enemyEnergies);
        int j = enemyEnergies.length - 1;

        while (j >= 0) {
            if (currentEnergy >= enemyEnergies[0]) {
                points += currentEnergy / enemyEnergies[0];
                currentEnergy = currentEnergy % enemyEnergies[0];
            } else {
                currentEnergy += enemyEnergies[j--];
            }
            if (points == 0) {
                break;
            }
        }
        
        return points;
        
//         long p = 0;
//         int lp = 0;
//         int rp = enemyEnergies.length - 1;

//         Arrays.sort(enemyEnergies);

//         while (lp <= rp) {
            
//             if (currentEnergy >= enemyEnergies[lp]) {
//                 currentEnergy -= enemyEnergies[lp];
//                 p++;
//                 lp++;
//             } else if (p > 0) {
                
//                 currentEnergy += enemyEnergies[rp];
//                 p--;
//                 rp--;
//             } else {
//                 break;
//             }
//         }
        
//         return p;
    }
}