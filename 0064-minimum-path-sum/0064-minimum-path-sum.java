class Solution {
    int[][] dp = new int[201][201]; // Assuming grid dimensions are at most 200x200

    public int minPathSum(int[][] grid) {
        int m = grid.length;         // Number of rows
        int n = grid[0].length;      // Number of columns

        for (int[] dp1 : dp) {
            Arrays.fill(dp1, -1);
        }

        // Start the recursive function from the top-left corner
        return recur(grid, m, n, 0, 0);
    }

    public int recur(int[][] grid, int m, int n, int i, int j) {
        // Boundary condition - if we go out of bounds
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE; // Return a very large value so this path is not chosen
        }

        // Base case - if we reach the bottom-right corner, return its value
        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }

        // Check if we've already calculated the minimum path sum for this cell
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Recur for right and down movements
        int right = recur(grid, m, n, i, j + 1);
        int down = recur(grid, m, n, i + 1, j);

        // Calculate the minimum path sum by adding the current cell's value to the minimum of the two options
        dp[i][j] = grid[i][j] + Math.min(right, down);

        return dp[i][j]; // Return the calculated minimum path sum for this cell
    }
}
