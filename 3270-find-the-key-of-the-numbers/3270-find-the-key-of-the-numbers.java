class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] smallestDigits = new int[4];
        
        
        for (int i = 0; i < 4; i++) {
            
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            
           
            smallestDigits[3 - i] = Math.min(Math.min(digit1, digit2), digit3);
            
            
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        
        
        int key = 0;
        for (int i = 0; i < 4; i++) {
            key = key * 10 + smallestDigits[i];
        }
        
        return key;
    }
}