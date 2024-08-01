class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        

        ArrayList<Integer> list = new ArrayList<>();
        

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();

        for(int i : nums1){
            s1.add(i);
        }

         for(int i : nums2){
            s2.add(i);
        }

         for(int i : nums3){
            s3.add(i);
        }

        HashMap<Integer, Integer> hm = new HashMap();

        for(int i : s1){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        
        for(int i : s2){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        
        for(int i : s3){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= 2) {
                list.add(entry.getKey());
            }
        }
        
        return list;
    }
}