class Solution {
    public String sortVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            if( (s.charAt(i) == 'a' ) || (s.charAt(i) == 'e' ) ||(s.charAt(i) == 'i' ) ||(s.charAt(i) == 'o' ) ||(s.charAt(i) == 'u' ) || (s.charAt(i) == 'A' ) ||(s.charAt(i) == 'E' ) ||(s.charAt(i) == 'I' ) ||(s.charAt(i) == 'O' ) || (s.charAt(i) == 'U' ) )  {
                vowels.add(s.charAt(i));
            }
        }
        Collections.sort(vowels);

        int k = 0;

        for(int j = 0; j<s.length(); j++){
            char ch = s.charAt(j);

             if( (s.charAt(j) == 'a' ) || (s.charAt(j) == 'e' ) ||(s.charAt(j) == 'i' ) ||(s.charAt(j) == 'o' ) ||(s.charAt(j) == 'u' ) || (s.charAt(j) == 'A' ) ||(s.charAt(j) == 'E' ) ||(s.charAt(j) == 'I' ) ||(s.charAt(j) == 'O' ) || (s.charAt(j) == 'U' ) )  {
                sb.append( vowels.get(k));
                k++;
            } else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}