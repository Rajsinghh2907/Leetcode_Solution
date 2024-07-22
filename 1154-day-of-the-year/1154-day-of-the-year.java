class Solution {
    public int dayOfYear(String date) {
        
        String str[] = date.split("-");

        int TotalDays = 0;

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i<month - 1; i++){

            if ( (isLeap(year) ) && i == 1) {
                TotalDays += days[i] + 1;
                continue;
            }

            TotalDays += days[i];
        }

        return TotalDays + day;

    }

    public static boolean isLeap(int year){
        if((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
            return true;
        }

        return false;
    }
}