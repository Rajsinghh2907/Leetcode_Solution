class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        
        Arrays.sort(batteryPercentages);

        return batteryPercentages[batteryPercentages.length -1];
    }
}