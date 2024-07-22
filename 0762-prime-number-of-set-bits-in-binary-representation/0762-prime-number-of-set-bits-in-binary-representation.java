class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for(int i = left; i<= right; i++){

        String binaryString = Integer.toBinaryString(i);
        int countOfOnes = countOnes(binaryString);
        boolean isPrime = isPrime(countOfOnes);

            if(isPrime){
                count++;
            }

        }

        return count;
    }

    // Method to count the number of 1's in a binary string
    public static int countOnes(String binaryString) {
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}