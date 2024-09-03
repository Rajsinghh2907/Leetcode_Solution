class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder numStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            numStr.append(c - 'a' + 1); 
            // The given string s is converted into a numerical string where each 
            // character c is replaced by its position in the alphabet 
            // (i.e., 'a' -> 1, 'b' -> 2, ..., 'z' -> 26).
        }

        int sum = 0;

        for(char ch : numStr.toString().toCharArray()){
            sum += ch - '0'; // Used to convert character to number value
        }

        for(int i = 1; i<k; i++){
            int newSum = 0;

            while(sum  > 0){
                newSum += sum % 10;
                sum /= 10;
            }

            sum = newSum;
            
        }

        return sum;
    }
}