class Solution {
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];

        for(int i = 0; i<=n; i++){
            int num = i;
            int count = 0;

            String BS = Integer.toBinaryString(num);

            for(int j = 0; j<BS.length(); j++){
                if(BS.charAt(j) == '1'){
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}