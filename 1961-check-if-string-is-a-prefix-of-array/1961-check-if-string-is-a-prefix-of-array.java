class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        StringBuilder sb = new StringBuilder();

        for(String i : words){
            sb.append(i);

            if(s.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }
}