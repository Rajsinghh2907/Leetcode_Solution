class Solution {
    public int countElements(int[] nums) {
        
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];
        int count = 0;

        // Count elements that are strictly greater than min and strictly less than max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max) {
                count++;
            }
        }

        return count;
    }
}