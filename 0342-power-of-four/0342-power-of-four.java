class Solution {
    public boolean isPowerOfFour(int n) {
        // for(int i = 0; i<=31; i++){
        //     if(n == Math.pow(4, i)){
        //         return true;
        //     }
        // }
        // return false;

        if(n <= 0){
            return false;
        } 
        if(n == 1){
            return true;
        }

        if(n % 4 == 0){
            return isPowerOfFour(n/4); // Recursive function
        }

        return false;
    }
}