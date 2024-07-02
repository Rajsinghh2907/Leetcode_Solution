class Solution {
    public int countEven(int num) {

        int sum = 0;
        int count = 0;
        
        for(int i = 1; i<=num; i++){

            int curr = i;
            
            while(curr > 0){
                int ld = curr%10;

                sum += ld;
                curr /=10;
            }

            if(sum % 2 == 0){
                count++;
            }

            sum = 0;
        }

        return count;
    }
}