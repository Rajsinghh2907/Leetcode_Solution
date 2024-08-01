class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int c = 0;

        for(int i = 0; i<n - 1; i++){

            if(nums[i] == nums[i+1]){
                c++;
                i++;
            }
        }

        int x = n -  (c*2) ;

        return new int [] {c,x};
    }
}