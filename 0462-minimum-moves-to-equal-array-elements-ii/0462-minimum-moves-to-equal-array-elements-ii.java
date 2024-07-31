class Solution {
    public int minMoves2(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int c = 0;

        int mid = nums[n/2];

        for(int i = 0; i<n; i++){

            c += Math.abs(mid - nums[i]);
        }

        return c;

    }
}