class Solution {
    public int integerBreak(int n) {

        // for this question if we check the example we saw that if n is greater than 
        // 4 then ans is multiple of 3 and 2nd max answer is multiple of 2 but we need
        // Max number so multiply of 3 is used 

        // if (n <=3)
        // for n = 2,the only possible split is 1 + 1,which gives a product of 1.
        // for n = 3,the only possible split is 2 + 1, which gives a product of 2.
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