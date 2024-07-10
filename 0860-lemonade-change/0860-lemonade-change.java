class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int count5 = 0;      // initially 5$ is 0
        int count10 = 0;      // 10$ is 0  

        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){  // if we get 5$ then we store and increase 5$ var by 1
                count5++;
            } else if(bills[i] == 10){  // if we get 10$ then 
                if(count5 > 0){     // check the condition of 5$ if it is 1 or more than give it to customer and
                    count5--;       // decrease by 1
                    count10++;      // customer give $10 so we increase by 1 of 10$
                }
                else {
                    return false;  // if this all condition false return false
                }
            } else{    // if we  get 20$ 
                if(count5 >= 1 && count10 >=1){  // check for 5$ and 10$
                    count10--;
                    count5--;
                } else if(count5 >= 3){ 
                    count5 -= 3;
                } else{
                    return false;
                }
            }
        }

        return true;
    }
}