class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int EmptyBotls = numBottles;
        int count = 0;

        while(EmptyBotls >= numExchange){

            EmptyBotls -= numExchange;
            EmptyBotls += 1;
            numExchange++; 
            count++;
        } 

        return numBottles + count;
    }
}