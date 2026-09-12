class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] row_matrix = new int[row];
        int[] col_matrix = new int[col];

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    row_matrix[i] = 1;
                    col_matrix[j] = 1;
                }
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(row_matrix[i]==1 || col_matrix[j]==1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}