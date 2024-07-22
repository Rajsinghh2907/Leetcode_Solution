class Solution {
    public long[] sumOfThree(long num) {

        long x = 0;
        
        if(num % 3 != 0) {
            return new long [] {};
        }

        if( num % 3 == 0){
            x = num / 3;
        }

        return new long [] { (x-1), x, (x+1)};

    }
}