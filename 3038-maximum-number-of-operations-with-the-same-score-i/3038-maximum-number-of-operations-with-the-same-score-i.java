class Solution {
    public int maxOperations(int[] nums) {
        
        int c = 1;
        int sum = nums[0] + nums[1];


        for(int i = 3; i<nums.length; i+=2){

            int sum2 = nums[i] + nums[i-1];

            if(sum == sum2){
                c++;
            } else{
                break;
            }
        }

        return c;
    }
}