class Solution {
    public int countAsterisks(String s) {
        
        String[] parts = s.split("\\|");

        int count = 0;

        for(int i = 0; i<parts.length; i++){
            String str = parts[i];

            if(i % 2 == 0){
                for(int j = 0; j<str.length(); j++){
                    if(str.charAt(j) == '*'){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}