
class Solution {

    public int orangesRotting(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int freshOranges = 0;

        // Step 1: Add all initially rotten oranges to the queue
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } 
                else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // Step 2: Direction arrays
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        int minutes = 0;

        // Step 3: Perform multi-source BFS
        while (!queue.isEmpty() && freshOranges > 0) {

            int size = queue.size();

            // Process all oranges at the current level
            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                int r = current[0];
                int c = current[1];

                for (int[] dir : directions) {

                    int newRow = r + dir[0];
                    int newCol = c + dir[1];

                    // Check boundaries and fresh orange
                    if (newRow >= 0 && newCol >= 0 &&
                        newRow < row && newCol < col &&
                        grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2;

                        freshOranges--;

                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }

            // One complete BFS level = one minute
            minutes++;
        }

        // Step 4: Check whether any fresh orange remains
        return freshOranges == 0 ? minutes : -1;
    }
}
