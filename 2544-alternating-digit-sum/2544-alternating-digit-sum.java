class Solution {
    public int alternateDigitSum(int n) {
        
        int count = 0;
        int sum = 0;

        while(n > 0){
            int ld = n%10;

            if(count % 2 == 0){
                sum = sum + ld;
            } else{
                sum = sum - ld;
            }
            n /= 10;
            count++;
           
        }

        return sum;
    }
}