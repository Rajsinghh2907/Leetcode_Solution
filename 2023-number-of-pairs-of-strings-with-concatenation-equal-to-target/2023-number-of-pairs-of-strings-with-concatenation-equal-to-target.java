class Solution {
    public int numOfPairs(String[] nums, String target) {
        
        int c = 0;

        for(int i = 0; i<nums.length; i++){
            String curr = nums[i];

            for(int j = 0; j<nums.length; j++){
                String nex = nums[j];

                if(i != j){

                    
                    String result = curr + nex;

                    if(result.equals(target)){
                    c++;
                    }
                }
            }
        }

        return c;
    }
}