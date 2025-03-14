class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr; // Edge case: Empty array
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        int rank = 1;

        // Assign ranks to elements
        for (int num : sortedArray) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace elements in original array with their rank
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}