class Solution {
    public String losingPlayer(int x, int y) {
        
        int c = 0;

        while (x >= 0 && y >= 3) {
            c++;
            x -= 1;
            y -= 4;
        }


        if( c % 2 != 0){
            return "Bob";
        }
        return "Alice";
    }
}