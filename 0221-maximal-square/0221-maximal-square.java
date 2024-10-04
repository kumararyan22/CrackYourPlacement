class Solution {

    int[][] dp = new int[300][300];

    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        // if(m == 0)
        // {
        //     return 0;
        // }
        
        int max = 0;
        int currmax = 0;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                currmax = findArea(matrix,i,j);
                if(max < currmax)
                {
                    max = currmax;
                }
            }
        }

        return max * max;
        
    }

        public int findArea(char[][] matrix , int i , int j)
        {
            int m = matrix.length;
            int n = matrix[0].length;

            if(i>=m || j>=n || matrix[i][j] == '0')
            {
                return 0;
            }

            if(dp[i][j] != 0)
            {
                return dp[i][j];
            }
            
            int r = findArea(matrix,i,j+1);
            int c = findArea(matrix,i+1,j);
            int dia = findArea(matrix,i+1,j+1);

            int sum = 1 + Math.min(r , Math.min(c,dia));
            dp[i][j] = sum;

            return dp[i][j];
        }
}