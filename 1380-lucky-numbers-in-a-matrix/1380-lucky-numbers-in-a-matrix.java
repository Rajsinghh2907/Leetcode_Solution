class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        int minrow[] = new int[n];
        int maxcol [] = new int[m];


        for(int i = 0; i<n; i++){
            minrow[i] = Integer.MAX_VALUE;
            for(int j = 0; j<m; j++){

                minrow[i] = Math.min(minrow[i], matrix[i][j]);
                maxcol[j] = Math.max(maxcol[j], matrix[i][j]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<n; i++){
            for(int j = 0; j <m; j++){
                if( (matrix[i][j] == minrow[i]) && (matrix[i][j] == maxcol[j]) ){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;

    }
}