class Solution {
    public boolean isFascinating(int n) {

        HashSet<Integer> hs = new HashSet<>();
        
        int ToN = 2 * n;
        int ThN = 3 * n;

        while(n > 0){

            if (n % 10 == 0 || hs.contains(n % 10)) {
                return false;
            } 
            hs.add(n % 10);
            n = n / 10;
        }

        while(ToN > 0){

             if (ToN % 10 == 0 || hs.contains(ToN % 10)) {
                return false;
            } 
            hs.add(ToN % 10);
            ToN = ToN / 10;
        }

        while(ThN > 0){

             if (ThN % 10 == 0 || hs.contains(ThN % 10)) {
                return false;
            } 
            hs.add(ThN % 10);
            ThN = ThN / 10;
        }

        return true;

    }
}