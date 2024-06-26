class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        int l = 0, r = l + k - 1;

        while(r < nums.length){
            ans = Math.min(ans, nums[r++] - nums[l++]);
        }

        return ans;
    }
}