class Solution {
    public int maximumNumberOfStringPairs(String[] words) {


        // HashSet<String> set = new HashSet<>();

        // int count = 0;
        
        // for (String word : words) {
        //     String reversed = new StringBuilder(word).reverse().toString(); // reverse the string array
            
        //     if (set.contains(reversed)) { // if reverse contain then update count
        //         count++;
        //         set.remove(reversed); // Remove to ensure each word only pairs once
        //     } else {
        //         set.add(word);
        //     }
        // }
        
        // return count;

        int ans = 0;

         for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){

                String word = words[j];

                String reversed = new StringBuilder(word).reverse().toString();

                if(words[i].equals(reversed)){
                    ans++;
                }
            }
        }
        return ans;
    }
}