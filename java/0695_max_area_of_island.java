class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, countIsland(grid, i, j));
                }
            }
        }
        
        return max;
        
    }

    public int countIsland(int[][] grid, int i, int j) {

        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = -1;
            return (1 +
                    countIsland(grid, i + 1, j) +
                    countIsland(grid, i - 1, j) +
                    countIsland(grid, i, j + 1) +
                    countIsland(grid, i, j - 1));
        }
        
        return 0;

    }
}
