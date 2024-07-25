class Solution {
    public boolean isValid(String word) {
        
        int n = word.length();
        int v = 0;
        int c = 0;

        if(n < 3){
            return false;
        }

        for(int i = 0; i<n; i++){
            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }



            if( (ch == 'a') || (ch == 'e') ||(ch == 'i') ||(ch == 'o') ||(ch == 'u') || (ch == 'A') ||(ch == 'E') ||(ch == 'I') ||(ch == 'O') ||(ch == 'U') ){
                v++;
            } else if (Character.isLetter(ch)) {
                c++;
            }
        }

        return v > 0 && c > 0; 
    }
}