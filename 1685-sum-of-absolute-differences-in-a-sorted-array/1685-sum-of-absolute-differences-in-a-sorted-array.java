class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {


        // TLE HAPPEN ANOTHER APPROACH
        
        // int n = nums.length;
        // int ans[] = new int[n];

        // for(int i = 0; i<n; i++){
        //     int curr = nums[i];

        //     int sum = 0;
        //     for(int j = 0; j<n; j++){
        //         sum += Math.abs(curr - nums[j]); 
        //     }

        //     ans[i] = sum;
        // }

        // return ans;


        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate left cumulative sum
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            result[i] += i * nums[i] - leftSum;
            leftSum += nums[i];
        }
        
        // Calculate right cumulative sum
        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += rightSum - (n - i - 1) * nums[i];
            rightSum += nums[i];
        }
        
        return result;
    
    }
}