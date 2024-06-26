class Solution {
    public boolean isGood(int[] nums) {
        
        int n = nums.length;

        Arrays.sort(nums);

        int x = nums[n-1];

        if( (n != x+1) || (x != nums[n-2])){
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;
       
    }
}