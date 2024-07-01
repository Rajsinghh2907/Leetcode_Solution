class Solution {
    public int[] evenOddBit(int n) {
        
        String str = Integer.toBinaryString(n); // It convert the Num into BinaryString

        int odd = 0, even = 0;


        for (int i = 0; i < str.length(); i++) {
           
            if (str.charAt(str.length() - 1 - i) == '1') {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        return new int[] { even, odd };
    }
}