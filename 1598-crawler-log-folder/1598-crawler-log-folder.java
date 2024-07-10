class Solution {
    public int minOperations(String[] logs) {
        
        int ans = 0;

        for( String i : logs){

            if( i.equals("../")){
                if(ans > 0){
                    ans--;
                }
            }
            else if(i.equals("./")){
                ans += 0;
            } else{
                ans++;
            }
        }

        return ans;
    }
}