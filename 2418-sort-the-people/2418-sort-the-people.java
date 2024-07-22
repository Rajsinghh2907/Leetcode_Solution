class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        // Basic Hum ek HashMap banalete hai same as questions with height and names
        HashMap<Integer, String> hm = new HashMap<>();

        // Usme hum sara data Copy krdete hai with height at i and names at i

        for(int i = 0; i<heights.length; i++){
            hm.put(heights[i], names[i]);
        }

        // now heights ko sort krdete hai

        Arrays.sort(heights);

        String ans [] = new String[heights.length];

        int x = 0;

        // fir heights ke saath string rhega usko print krwa do in desending order

        for(int i = heights.length - 1; i>=0; i--){
            ans[x] = hm.get(heights[i]);
            x++;
        }

        return ans;
    }
}