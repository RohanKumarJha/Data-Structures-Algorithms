class Solution {
    private void findIslands(char[][] grid,int row,int col) {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length) return ;
        if(grid[row][col] == '0') return ;
        grid[row][col] = '0';
        findIslands(grid,row+1,col);
        findIslands(grid,row-1,col);
        findIslands(grid,row,col+1);
        findIslands(grid,row,col-1);
    }

    public int numIslands(char[][] grid) {
        int no_of_island = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(grid[i][j] == '1') {
                    findIslands(grid,i,j);
                    no_of_island++;
                }
            }
        }
        return no_of_island;
    }
}


