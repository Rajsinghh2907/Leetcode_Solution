class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int mul = getm(n);

            if(mul % t == 0){
                return n;
            }
            else {
                n++;
            }
        }
    }

    public static int getm(int n){
            int n1 = n % 10;
            n /= 10;

            int n2 = n % 10;


            return n1 * n2;
        }
}