class Solution {
    public List<Integer> majorityElement(int[] nums) {

       Arrays.sort(nums);

        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();

        int x = nums.length/3;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                if (count > x) {
                    list.add(nums[i - 1]);
                }
                count = 1;
            }
        }

           if (count > x) {
            list.add(nums[nums.length - 1]);
        }

        return list;
    }
}