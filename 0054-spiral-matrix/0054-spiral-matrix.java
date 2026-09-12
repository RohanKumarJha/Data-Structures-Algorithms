class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int row_start = 0;
        int col_start = 0;
        int row_end = matrix.length-1;
        int col_end = matrix[0].length-1;

        int row = matrix.length;
        int col = matrix[0].length;

        int count = 0;

        while(count < row*col) {
            
            int i = col_start;
            while(i <= col_end) {
                result.add(matrix[row_start][i]);
                count++;
                i++;
            } row_start++;
            if(count == row*col) break;

            i = row_start;
            while(i <= row_end) {
                result.add(matrix[i][col_end]);
                count++;
                i++;
            } col_end--;
            if(count == row*col) break;

            i = col_end;
            while(i >= col_start) {
                result.add(matrix[row_end][i]);
                count++;
                i--;
            } row_end--;
            if(count == row*col) break;

            i = row_end;
            while(i >= row_start) {
                result.add(matrix[i][col_start]);
                count++;
                i--;
            } col_start++;
            if(count == row*col) break;

        }

        return result;
    }
}