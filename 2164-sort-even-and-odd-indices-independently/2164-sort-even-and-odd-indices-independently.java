class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        int n = nums.length;

        Integer[] oddArr = new Integer[n/2];
        Integer[] evenArr = new Integer[n - n/2];

        int x = 0, y = 0;

        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                evenArr[x] = nums[i];
                x++;
            } else if(i % 2 != 0){
                oddArr[y] = nums[i];
                y++;
            }
        }

        Arrays.sort(evenArr);
        Arrays.sort(oddArr, Collections.reverseOrder());

        int ans[] = new int[n];

        int oddIndex = 0;
        int evenIndex = 0;


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[i] = evenArr[evenIndex++];
            } else {
                ans[i] = oddArr[oddIndex++];
            }
        }

        return ans;

    }
}