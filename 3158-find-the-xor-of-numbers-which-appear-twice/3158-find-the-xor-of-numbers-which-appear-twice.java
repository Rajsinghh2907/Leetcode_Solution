class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                list.add(nums[i]);
            }
        }

        if(list.size() == 0){
            return 0;
        }

        int ans = list.get(0);

        for(int i = 1; i<list.size(); i++){
            ans = ans ^ list.get(i);
        }

        return ans;
    }
}