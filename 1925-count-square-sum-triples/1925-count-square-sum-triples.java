class Solution {
    public int countTriples(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 1; i<=n; i++){
            set.add(i * i);
        }

        int count = 0;

        for(int a = 1; a<=n; a++){
            for(int b = 1; b<=n; b++){

                int x = (a * a) + (b * b);

                if(set.contains(x)){
                    int x2 = (int) Math.sqrt(x);
                
                // Ensure c is within the range [1, n]
                    if (x2 <= n) {
                        count++;
                    }
                }
               
            }
        }

        return count;
    }
}