class Solution {
    public int[] separateDigits(int[] nums) {
        
       ArrayList<Integer> list = new ArrayList<>();

       for(int i = 0; i<nums.length; i++){
        int curr = nums[i];

        ArrayList<Integer> temp = new ArrayList<>();
            while (curr > 0) {
                int ld = curr % 10;
                temp.add(ld);
                curr /= 10;
            }
            // Reverse the temp list and add its elements to the main list
            for (int j = temp.size() - 1; j >= 0; j--) {
                list.add(temp.get(j));
            }
        }

        // Convert the ArrayList to an int array
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}