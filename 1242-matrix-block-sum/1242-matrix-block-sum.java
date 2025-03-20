class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int m = mat.length;
        int n = mat[0].length;
        int[][] block = new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int r1 = Math.max(0 , i-k);
                int c1 = Math.max(0 , j-k);
                int r2 = Math.min(m-1 , i+k);
                int c2 = Math.min(n-1 , j+k);

                for(int a=r1; a<=r2; a++)
                {
                    for(int b=c1; b<=c2; b++)
                    {
                        block[i][j] += mat[a][b];
                    }
                }
            }
        }

        return block;
    }
}