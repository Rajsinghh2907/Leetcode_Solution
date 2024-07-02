class Solution {
    public int[] distinctDifferenceArray(int[] nums) {

        int n = nums.length;
        int ans[] = new int[nums.length];
        HashSet<Integer> hs1 = new HashSet<>();

        for(int i = 0; i<n; i++){
            hs1.add(nums[i]);

            HashSet<Integer> hs2 = new HashSet<>();

            for(int j = i+1; j<n; j++){
                hs2.add(nums[j]);
            }

            ans[i] = hs1.size() - hs2.size();
        }

        return ans;

    }
}