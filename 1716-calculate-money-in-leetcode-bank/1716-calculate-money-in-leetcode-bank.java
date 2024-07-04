class Solution {
    public int totalMoney(int n) {
        
        int a = n/7;
        int b = n % 7;

        int x = (a*28) + (7 * (a * (a - 1)) / 2);


        int y = 0;
        int z = a+1;

        for(int j = 0; j<b; j++){
            y += z+j;
        }

        int ans = x + y;

        return ans;
    }
}