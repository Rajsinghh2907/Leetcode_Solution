class Solution {
    public int mostFrequentEven(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                list.add(nums[i]);
            }
        }

        if(list.size() == 0){
            return -1;
        }

        Collections.sort(list);
        int mostFrequentElement = list.get(0);
        int maxFrequency = 1;
        int currentElement = list.get(0);
        int currentFrequency = 1;

        // Count the frequency of each element
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == currentElement) {
                currentFrequency++;
            } else {
                currentElement = list.get(i);
                currentFrequency = 1;
            }

            // Update the most frequent element
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && currentElement < mostFrequentElement)) {
                mostFrequentElement = currentElement;
                maxFrequency = currentFrequency;
            }
        }

        return mostFrequentElement;
    }
}