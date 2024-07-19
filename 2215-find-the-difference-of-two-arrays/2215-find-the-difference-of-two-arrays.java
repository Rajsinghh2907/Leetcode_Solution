class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
       Set<Integer> s1 = new HashSet<>();
       Set<Integer> s2 = new HashSet<>(); // create two HashSet

        for(int num : nums1){
            s1.add(num);
       }

       
        for(int num : nums2){
            s2.add(num);    // add nums1 and nums2 to set1 and set2
       }

       ArrayList<Integer> d1 = new ArrayList<>(s1);
       d1.removeAll(s2);

       ArrayList<Integer> d2 = new ArrayList<>(s2);
       d2.removeAll(s1);

       List<List<Integer>> result = new ArrayList<>();
       result.add(d1);
       result.add(d2);

       return result;

    }
}