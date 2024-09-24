class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int ans[] = new int[2];
        int a = 0;

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                ans[a] = nums[i];
                a++; i++;
            }
        }

        return ans;
    }
}