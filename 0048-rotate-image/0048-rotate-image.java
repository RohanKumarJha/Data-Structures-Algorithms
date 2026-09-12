class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                result[j][row-i-1] = matrix[i][j];
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}

// 1 2 3
// 4 5 6 
// 7 8 9

// matrix[i][j] = matrix[][]

