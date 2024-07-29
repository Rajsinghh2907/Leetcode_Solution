class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character, Character> hm = new HashMap<>();
        int ch = 97;

        for(int i = 0; i<key.length(); i++) {
            char c = key.charAt(i);
            
            if(c == ' '){
                continue;
            }

            if(!hm.containsKey(c)) {
                hm.put(c, (char)ch);
                ch++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<message.length(); i++){
            char s = message.charAt(i);

            if(s == ' '){
                sb.append(' ');
            } else{
                char en = hm.get(s);
                sb.append(en);
            }

        }

        return sb.toString();
    }
}