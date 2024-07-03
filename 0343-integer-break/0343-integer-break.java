class Solution {
    public int integerBreak(int n) {

        if(n < 4){
            return n-1;
        }

        if(n == 4){
            return 4;
        }

        int sum = 1;

        while(n >=5){
            sum = sum * 3;
            n = n-3;
        }
        sum = sum * n;

        return sum;
    }
}