class Solution {
    public int passThePillow(int n, int time) {
        
        int curr = 1;
        int dir = 1;

        while(time > 0){

            curr += dir;
            time--;

            if (curr == n || curr == 1) {
                dir *= -1; // Reverse the direction
            }
        }
        
        return curr;

    }
}