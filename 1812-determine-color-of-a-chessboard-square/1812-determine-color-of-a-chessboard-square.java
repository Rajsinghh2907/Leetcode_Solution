class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = Integer.parseInt(coordinates.substring(1));

        int sum = x+y;

        if(sum % 2 == 0){
            return false;
        }

        return true;
    }
}