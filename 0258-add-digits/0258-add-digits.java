class Solution {
    public int addDigits(int num) {

        int ans = sumNum(num);
        // Recursively call sumNum until ans is a single digit
        while (ans > 9) {
            ans = sumNum(ans);
        }
        return ans;
    }

    public static int sumNum(int n) {
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }
}