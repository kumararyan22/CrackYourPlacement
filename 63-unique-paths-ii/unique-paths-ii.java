class Solution {
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
        {
            return 0;
        }


        dp = new int[m+1][n+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        return helper(obstacleGrid ,m , n, 0 , 0);
    }

    public int helper(int[][] obstacleGrid ,int m, int n, int i, int j)
    {
        if(i == m-1 && j == n-1)
        {
            return 1;
        }

        if(i<0 || i>=m || j<0 || j>=n || obstacleGrid[i][j] == 1)
        {
            return 0;
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        int right = helper(obstacleGrid,m,n,i,j+1);
        int down = helper(obstacleGrid,m,n,i+1,j);

        dp[i][j] = right + down;

        return dp[i][j];
    }
}