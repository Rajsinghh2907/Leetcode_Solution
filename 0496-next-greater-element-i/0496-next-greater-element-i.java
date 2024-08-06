class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
         HashMap<Integer, Integer> hm = new HashMap<>();

        // Initialize map with default value -1 for all elements in nums2
        
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], -1);
        }

        // Find next greater element for each element in nums2
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) {
                    hm.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }

        // Create result array
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = hm.get(nums1[i]);
        }

        return result;
    }
}