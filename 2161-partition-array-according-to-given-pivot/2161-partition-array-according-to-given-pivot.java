class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(nums[i] < pivot){
                list.add(nums[i]);
            }
        }

        for(int i = 0; i<n; i++){
            if(nums[i] == pivot){
                list.add(nums[i]);
            }
        }

        
        for(int i = 0; i<n; i++){
            if(nums[i] > pivot){
                list.add(nums[i]);
            }
        }

       int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}