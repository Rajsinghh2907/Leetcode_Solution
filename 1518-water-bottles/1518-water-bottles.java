class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int count = numBottles;


        while(numBottles >= numExchange){

            int DrBot =  numBottles / numExchange;
            int rem = numBottles % numExchange;

            count += DrBot;
            numBottles=DrBot + rem;
        }

        return count;
    }
}