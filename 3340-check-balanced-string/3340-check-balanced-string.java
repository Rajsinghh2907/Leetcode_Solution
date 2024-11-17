class Solution {
    public boolean isBalanced(String num) {
        
        int s1 = 0;
        int s2 = 0;

        for(int i = 0; i<num.length(); i++){
            if(i % 2 == 0){
                char c1 = num.charAt(i);
                int num1 = Character.getNumericValue(c1);

                s1 += num1; 
            } else{
                char c2 = num.charAt(i);
                int num2 = Character.getNumericValue(c2);

                s2 += num2;
            }
        }

        return s1 == s2;
    }
}