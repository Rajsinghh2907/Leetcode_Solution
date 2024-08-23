class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0 ; i<matrix.length; i++){
        //     for(int j = 0 ; j<matrix[0].length; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if(matrix[row][col] > target){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
}