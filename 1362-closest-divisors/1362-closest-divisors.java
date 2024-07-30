class Solution {
    public int[] closestDivisors(int num) {

        int n1 = num + 1, n2 = num + 2;
        
        int i = (int) Math.sqrt(n1);
        int j = (int) Math.sqrt(n2);

        while( j > 0){
            
            int pro = i * j;

            if( (pro == n1) || (pro == n2)){
                return new int [] {i , j};

            } else if( pro < n2){
                i++;
            } else{
                j--;
            }
        }

        return new int[] {};
    }
}