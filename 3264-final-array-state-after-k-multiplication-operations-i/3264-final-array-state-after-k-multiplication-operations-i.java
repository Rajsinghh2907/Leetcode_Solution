class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for(int i = 0; i<k; i++){
            int a = findIndexOfSmallest(nums);

            nums[a] = nums[a] * multiplier;

        }

        return nums;

    }

     public static int findIndexOfSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minIndex = 0; 
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i; // Update the index of the smallest number
            }
        }

        return minIndex;
    }
}