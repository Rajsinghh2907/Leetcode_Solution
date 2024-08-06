class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int i = 0; i<=31; i++){
        //     if(n == Math.pow(2, i)){
        //         return true;
        //     }
        // }
        // return false;









        // if(n == 0){
        //     return false;
        // }
        // if(n == -2147483648){
        //     return false;
        // }

        // return (n & (n-1)) == 0;



        if(n <= 0){
            return false;
        }

        if( n == 1){
            return true;
        }

        if(n % 2 == 0){
            return isPowerOfTwo(n / 2); // recursive function
        }

        return false;
    }
}