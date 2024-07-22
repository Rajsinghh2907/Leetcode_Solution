class Solution {
    public int maximumGroups(int[] grades) {
        
        Arrays.sort(grades);

        int count = 0, s = 0;

        for(int i = 0; i<grades.length; i++){
            s++;
            count++;


            if(grades.length - i - s <=s){
                return count;
            }
        }

        return count;

    }
}