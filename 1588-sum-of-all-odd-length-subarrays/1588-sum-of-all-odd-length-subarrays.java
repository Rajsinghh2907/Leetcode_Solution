class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        

         int sum = 0;
        int n = arr.length;
        
        // Iterate through all possible odd lengths
        for (int len = 1; len <= n; len += 2) {
            // Calculate sum of all subarrays of current length len
            for (int start = 0; start <= n - len; start++) {
                int subarraySum = 0;
                // Sum elements in the subarray from start to start + len - 1
                for (int i = start; i < start + len; i++) {
                    subarraySum += arr[i];
                }
                sum += subarraySum;
            }
        }
        
        return sum;
    }
}