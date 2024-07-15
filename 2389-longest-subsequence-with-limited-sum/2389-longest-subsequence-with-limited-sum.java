class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);

        int n = queries.length;

        int ans[] = new int[n];

        for(int i = 0; i<n; i++){
            int curr = queries[i];
            int sum = 0;

            for(int j = 0; j<nums.length; j++){
                sum += nums[j];
                if(sum > curr){
                    ans[i] = j;
                    break;
                }

                if (j == nums.length - 1) {
                    ans[i] = nums.length;
                }   
            }     
        }

        return ans;
    }
}