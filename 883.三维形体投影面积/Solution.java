class Solution {
    public int projectionArea(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0, max2 = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0)
                    result++;
                if (grid[i][j] > max)
                    max = grid[i][j];
                if (grid[j][i] > max2)
                    max2 = grid[j][i];
            }
            result += max + max2;
        }
        return result;
    }
}