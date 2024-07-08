class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n = nums.length;
        int Lsum[] = new int[n];
        int Rsum[] = new int[n];

        int ans[] = new int[n];

        int sum1 = 0;

        for(int i = 0; i<n; i++){
            sum1 += nums[i]; 
            Lsum[i] = sum1;
        }

        int sum2 = 0;

        for(int j = n-1; j>=0; j--){
            sum2 += nums[j];

            Rsum[j] = sum2; 
        }

        int sum = 0;

        for(int  k = 0; k<n; k++){
            ans[k] = Math.abs(Lsum[k] - Rsum[k]);
        } 

        return ans;       
    }
}