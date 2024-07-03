class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int count [] = new int [46];

        for(int i = lowLimit; i<=highLimit; i++){
            int curr = i;
            int sum = 0;

            while(curr > 0){
                sum += curr%10;
                curr /=10;
            }

            count[sum]++;
        }

        Arrays.sort(count);

        return count[45];
    }
}