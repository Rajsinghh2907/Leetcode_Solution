class Solution {
    public int titleToNumber(String columnTitle) {

        int sum = 0;
        
        for(int i = 0; i < columnTitle.length(); i++){
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;

            sum = sum *  26 + value;
        }

        return sum;
    }
}