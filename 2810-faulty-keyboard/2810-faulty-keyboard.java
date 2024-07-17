class Solution {
    public String finalString(String s) {
        
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i<s.length(); i++){
        //     if(s.charAt(i) == 'i'){
        //         sb.reverse();
        //     } else{
        //         sb.append(s.charAt(i));
        //     }
        // }

        // return sb.toString();

         
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                sb = new StringBuilder(rev(sb.toString()));
            } else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String rev(String st) {
        char[] charArray = st.toCharArray();
        int i = 0, j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        return new String(charArray);
    }
}