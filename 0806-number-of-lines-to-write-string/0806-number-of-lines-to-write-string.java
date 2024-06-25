class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        HashMap<Character, Integer> hs = new HashMap<>();

        for (int i = 0; i < widths.length; i++) {
            hs.put((char) ('a' + i), widths[i]);
        }

        int sum = 0;
        int n = 1;

        for(int i = 0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            int width = hs.get(ch);

            if(sum + width > 100){
                n++;
                sum = width;
            } else{
                sum += width;
            }
        }

        return new int[] {n, sum};
    }
}