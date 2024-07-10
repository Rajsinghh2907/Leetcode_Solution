class Solution {
    public int countBeautifulPairs(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        
       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int firstDigit = getFirstDigit(nums[i]); // we call firstDigit function
                int lastDigit = getLastDigit(nums[j]);  // call lastdigit function
                
                if (isCoprime(firstDigit, lastDigit)) {
                    count++;
                }
            }
        }
        
        return count;
    }


    
    // Function to get the first digit of a number
    private int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }


    private int getLastDigit(int num) {
        return num % 10;
    }

    
    
    // Function to check if two numbers are coprime
    private boolean isCoprime(int a, int b) {
        // Calculate gcd of a and b
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // If gcd is 1, a and b are coprime
        return a == 1;
    }
}