class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<n; i++){

            int num = i+1;
            int sum = 0;

            while(num > 0){
                int ld = num % 10;
                sum +=ld;
                num /=10;
            }

            hm.put(sum , hm.getOrDefault(sum, 0) + 1);

        }

         int maxSize = 0;
        for (int freq : hm.values()) {
            if (freq > maxSize) {
                maxSize = freq;
            }
        }

        // Count the number of digit sums that have the maximum frequency
        int count = 0;
        for (int freq : hm.values()) {
            if (freq == maxSize) {
                count++;
            }
        }

        return count;
    }
}