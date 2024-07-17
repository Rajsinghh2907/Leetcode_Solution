class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int One = 0;
        int Zero = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                Zero++;
            } else{
                One++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < One - 1; i++) {
            sb.append('1');
        }

        for (int i = 0; i < Zero; i++) {
            sb.append('0');
        }

        sb.append('1');

        return sb.toString();
    }
}