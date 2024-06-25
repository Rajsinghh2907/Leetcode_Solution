class Solution {
    public int minimumOperations(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>(); // set me 2 number same nhi ho sakta

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){  
                hs.add(nums[i]); // jitna bhi number ko zero krna hai utna add kro aur jo same rhega wo add nhi hoga
            }
        }

        return hs.size(); 
    }
}