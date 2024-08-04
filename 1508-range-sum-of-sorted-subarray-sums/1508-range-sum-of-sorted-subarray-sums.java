class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        int arr[] = new int[n * (n + 1) / 2];
        int idx = 0;

        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i ; j<n; j++){ 
                                    
                sum = sum + nums[j];
                    arr[idx] = sum;
                    idx++;
            }
        }
        Arrays.sort(arr);
        int mod = (int)1e9 + 7;

        int ts = 0;
        for(int i = left - 1; i<right; i++){
            ts = ts % mod + arr[i];
        }
        return ts;
    }
}