class Solution {

    int n,m;
    int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public int findMaxFish(int[][] grid) {
        n = grid.length;
        m = grid[0].length;

        int maxFish = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] > 0)
                {
                    maxFish = Math.max(maxFish, dfs(i,j,grid));
                }
            }
        }
        return maxFish;
        
    }

    public int dfs(int i, int j, int[][] grid)
    {
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j] == 0)
        {
            return 0;
        }

        int fishCount = grid[i][j];
        grid[i][j] = 0;

        for(int[] dir : direction)
        {
            int row = i + dir[0];
            int col = j + dir[1];

            fishCount += dfs(row,col,grid);
        }
        return fishCount;
    }
}