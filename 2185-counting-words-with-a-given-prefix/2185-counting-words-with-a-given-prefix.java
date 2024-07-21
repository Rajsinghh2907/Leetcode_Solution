class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;

        //BRUTE FORCE TIME COMPLEXITY IS O(N^2)

        // for(int i = 0; i<words.length; i++){
        //     String s = words[i];

        //     StringBuilder sb = new StringBuilder();

        //     for(int j = 0; j<s.length(); j++){
        //         char ch = s.charAt(j);
        //         sb.append(ch);

        //         if(sb.toString().equals(pref)){
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // return count;

         for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }

        return count;
    }
}