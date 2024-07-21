class Solution {
    public String generateTheString(int n) {
        
        StringBuilder sb = new StringBuilder();

        if(n % 2 != 0){
            for(int i = 0; i<n; i++){
                sb.append('a');
            }
        } else if(n % 2 == 0){
            sb.append('a');
            
            for(int j = 0; j<n-1; j++){
                sb.append('b');
            }
        }

        return sb.toString();
    }
}