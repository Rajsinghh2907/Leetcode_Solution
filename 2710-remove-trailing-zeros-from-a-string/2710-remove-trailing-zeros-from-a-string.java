class Solution {
    public String removeTrailingZeros(String num) {
        
        int c = 0;

        for(int i = num.length() - 1; i>=0; i--){
            if(num.charAt(i) != '0'){
                break;
            } else{
                c++;
            }
        }

        int x = num.length() - c;

        return (num.subSequence(0, x)).toString();

    }
}