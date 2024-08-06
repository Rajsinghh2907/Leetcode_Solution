class Solution {
    public int[] nextGreaterElements(int[] nums) {
    

        int n = nums.length;

        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i]  < nums[j]){
        //             ans[i] = nums[j];
        //             break;
        //         }
        //         // }else{
        //         //     ans[i] = -1;
        //         // }
        //         //  if(j == nums.length-1){
        //         // j = 0;
        //         //}
        //         if(j == nums.length-1){
        //              ans[i] = -1; 
        //         }


        //     } 
            
        // }

      
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize the result array with -1s

        // Iterate over each element in the array
        for (int i = 0; i < n; i++) {
            // Check the next elements in a circular manner
            for (int j = 1; j < n; j++) {
                if (nums[(i + j) % n] > nums[i]) {
                    result[i] = nums[(i + j) % n];
                    break;
                }
            }
        }

        return result;
    }
}