class Solution {
    public String replaceDigits(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<s.length(); i++){
            char c = s.charAt(i);


            if (Character.isDigit(c)) {

                int num = c - '0'; // Convert char digit to int
                char previousChar = s.charAt(i - 1);
                char shiftedChar = shift(previousChar, num);
                sb.append(shiftedChar);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private char shift(char c, int x) {
        return (char) (c + x);
    }
}