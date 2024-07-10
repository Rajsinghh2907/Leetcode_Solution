class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int l = 0, r = 0, c = 0;
        int ans = 0;

        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                l++;
            } else if(moves.charAt(i) == 'R'){
                r++;
            } else{
                c++;
            }
        }

        if(l >= r){
            ans = l + c - r;
        } else{
            ans = r + c - l;
        }

        return ans;
    }
}