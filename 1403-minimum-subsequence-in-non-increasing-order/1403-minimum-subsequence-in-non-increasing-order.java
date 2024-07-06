class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int sum = 0;
        int sum2 = 0;
        
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }

        for(int j = nums.length - 1; j>=0; j--){
            sum2 += nums[j];
            list.add(nums[j]);

            if( (sum - sum2) < sum2){
                break;
            }
            
        }

        return list;
    }
}