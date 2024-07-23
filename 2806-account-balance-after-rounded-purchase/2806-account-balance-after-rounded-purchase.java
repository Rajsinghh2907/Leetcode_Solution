class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
        int ld = purchaseAmount % 10;
        int a = 10 - ld;

        int x = 0;

        if(ld >= 5){
            purchaseAmount += a;
        } else{
            purchaseAmount -= ld;
        }

        return 100 - purchaseAmount;
    }
}