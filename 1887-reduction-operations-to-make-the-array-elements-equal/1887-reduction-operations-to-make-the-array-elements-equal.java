class Solution {
    public int reductionOperations(int[] nums) {
        
        Arrays.sort(nums);

        int ans = 0;
        int n = nums.length;

        for(int i = n-1; i>0; i--){
            if(nums[i-1] != nums[i]){
                ans += (n-i);
            }
        }
        return ans;
    }
}