class Solution {
    public int minMaxDifference(int num) {

        String strNum = String.valueOf(num);

        // Find the maximum value
        int maxValue = num;
        for (char d1 = '0'; d1 <= '9'; d1++) {
            String maxStr = strNum.replace(d1, '9');
            maxValue = Math.max(maxValue, Integer.parseInt(maxStr));
        }

        // Find the minimum value
        int minValue = num;
        for (char d1 = '1'; d1 <= '9'; d1++) {
            String minStr = strNum.replace(d1, '0');
            minValue = Math.min(minValue, Integer.parseInt(minStr));
        }

        return maxValue - minValue;

    }
}