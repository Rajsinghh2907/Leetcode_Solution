class Solution {
    public int[] minOperations(String boxes) {
        
        int n = boxes.length();
        int ans[] = new int[n];

        for(int i = 0; i<n; i++){
            // char curr = boxes.charAt(i);
            int count = 0;

            for(int j = 0; j<n; j++){
                char ch = boxes.charAt(j);

                if(ch == '1'){
                    count += Math.abs(j - i);
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}