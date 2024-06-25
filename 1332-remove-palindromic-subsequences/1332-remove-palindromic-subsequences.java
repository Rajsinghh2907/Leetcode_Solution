class Solution {
    public int removePalindromeSub(String s) {

        int i = 0, j = s.length() - 1;

        int count = 0;

        while( i < j){
            if(s.charAt(i) != s.charAt(j)){
               return 2;
            }
            i++; j--;
        }

        return 1;
    }
}