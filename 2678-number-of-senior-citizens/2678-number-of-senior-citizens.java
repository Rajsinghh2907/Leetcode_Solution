class Solution {
    public int countSeniors(String[] details) {
        
        // int ans[] = new int[details.length];
        int count = 0;

        for(int i = 0; i<details.length; i++){
            String s = details[i];

            int x = Integer.parseInt(s.substring(11, 13));

            if( x > 60){
                count++;
            }
        }

        return count;
    }
}