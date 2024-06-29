class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs); // Sort the String by there Ascii value 

        StringBuilder sb = new StringBuilder();

        // Now Checks the fast and last String common words and return it

        String One = strs[0];
        String Two = strs[strs.length - 1];
        int i = 0;

        int n = Math.min(One.length(), Two.length());

        while( i < n){
            if(One.charAt(i) != Two.charAt(i)){
                return sb.toString();
            } else{
                sb.append(One.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}