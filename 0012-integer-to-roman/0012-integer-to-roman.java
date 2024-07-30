class Solution {
    public String intToRoman(int num) {
        

        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // put all the numberical value whic we take for Roman
        String[] romanNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while(num > 0){
            if(num >= numbers[i]){
                sb.append(romanNum[i]);

                num -= numbers[i];
            } else{
                i++;
            }
        }

        return sb.toString();
        
    }
}