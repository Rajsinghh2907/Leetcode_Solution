class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        

        long volume = (long) length * width * height;
        
        // Check if the box is "Bulky"
        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L;
        
        // Check if the box is "Heavy"
        boolean isHeavy = mass >= 100;
        
        // Determine the category based on the conditions
        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}