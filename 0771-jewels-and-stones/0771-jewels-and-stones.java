class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int j = 0;
        int count = 0;

        while(j < jewels.length()){
            char ch = jewels.charAt(j);

            for(int i = 0; i<stones.length(); i++){
                if(ch == stones.charAt(i)){
                    count++;
                }
            }
            j++;
        }

        return count;
    }
}