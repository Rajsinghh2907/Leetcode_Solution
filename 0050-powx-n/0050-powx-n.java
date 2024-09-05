class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        if (n == 0) {
            return 1.0;
        }

        // Recursive step: divide the problem by reducing n
        double half = myPow(x, n / 2);

        // If n is even, the result is half * half
        if (n % 2 == 0) {
            return half * half;
        } else {
            // If n is odd
            if (n > 0) {
                return half * half * x;
            } else {
                return half * half / x;
            }
        }
    }
}