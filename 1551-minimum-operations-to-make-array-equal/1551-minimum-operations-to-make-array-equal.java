class Solution {
    public int minOperations(int n) {

        int sum = 0;
        
        if(n % 2 != 0){
            int a = n / 2;

            for(int i = 0; i<a; i++){
                sum += (i*2) + 2;
            }
        } else{
            int a = n / 2;
            for (int i = 0; i < a; i++) {
                sum += (i * 2) + 1;
            }
        }

        return sum;
    }
}