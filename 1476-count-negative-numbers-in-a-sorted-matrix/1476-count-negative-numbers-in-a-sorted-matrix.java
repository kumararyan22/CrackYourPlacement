class Solution {
    public int countNegatives(int[][] grid) {
        
        // int m = grid.length;        //brute force 
        // int n = grid[0].length;
        // int negCount = 0;

        // for(int i=0; i<m; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         if(grid[i][j] < 0)
        //         {
        //             negCount++;
        //         }
        //     }
        // }

        // return negCount;

        
        int n = grid.length;
        int m = grid[0].length;
        int i=0;
        int j = m-1;

        int count =0 ;

        while(i < n && j >= 0)
        {
            if(grid[i][j] >= 0)
            {
                i++;
            }
            else
            {
                count += n - i;
                j--;
            }
        }

        return count;
        
    }
}