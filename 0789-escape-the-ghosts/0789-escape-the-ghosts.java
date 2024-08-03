class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {

        int t1 = target[0];
        int t2 = target[1];

        int playerDistance = Math.abs(t1) + Math.abs(t2);
        
        for(int i = 0; i<ghosts.length; i++){
            int g1 = ghosts[i][0];
            int g2 = ghosts[i][1];


            int ghostDistance = Math.abs(g1 - t1) + Math.abs(g2 - t2);

            // If any ghost can reach the target before or at the same time as the player
            if (ghostDistance <= playerDistance) {
                return false;
            }
        }

        return true;
    }
}