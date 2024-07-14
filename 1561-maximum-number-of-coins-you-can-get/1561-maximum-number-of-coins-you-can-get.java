class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int ans = 0;
        int n = piles.length / 3;

        for(int i = n; i < piles.length; i = i+2){
            ans += piles[i];
        }

        return ans;


    }
}