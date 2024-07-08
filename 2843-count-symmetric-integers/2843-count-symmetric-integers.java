class Solution {
    public int countSymmetricIntegers(int low, int high) {

        int count = 0;
        
        for(int i = low; i<=high; i++){

            String str = Integer.toString(i);
            int n = str.length();

            if(n % 2 == 0){

                int len = n/2;
                int sum1 = 0;
                int sum2 = 0;


                for(int a = 0; a<len; a++){
                    sum1 += str.charAt(a) - '0';
                }

                for(int a = len; a<n; a++){
                    sum2 += str.charAt(a) - '0';
                }

                if(sum1 == sum2){
                    count++;
                }
            }
        }

        return count;
    }
}