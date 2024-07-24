class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String s = Integer.toString(num);
        int count = 0;

        for(int i = 0; i<=s.length()-k; i++){
            String ss = s.substring(i,i+k);
            try {
                int n = Integer.parseInt(ss);
                if (n != 0 && num % n == 0) {
                    count++;
                }
            } catch (NumberFormatException e) {
                // Handle the case where the substring cannot be parsed to an integer
                System.out.println("Invalid number format: " + ss);
            }
        }

        return count;
    }
}