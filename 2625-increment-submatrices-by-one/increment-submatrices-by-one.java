class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                mat[i][j] = 0;
            }
        }

        for(int[] qry : queries)
        {
            int row1 = qry[0];
            int col1 = qry[1];
            int row2 = qry[2];
            int col2 = qry[3];

            for(int i=row1; i<=row2; i++)
            {
                for(int j=col1; j<=col2; j++)
                {
                    mat[i][j] += 1;
                }
            }
        }

        return mat;
    }
}   