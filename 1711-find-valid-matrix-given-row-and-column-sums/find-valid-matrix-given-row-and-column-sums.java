class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int m = rowSum.length;
        int n = colSum.length;

        int[][] valid = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                valid[i][j] = 0;
            }
        }

        int i=0;
        int j=0;

        while(i < m && j < n)
        {
            valid[i][j] = Math.min(rowSum[i] , colSum[j]);

            rowSum[i] -= valid[i][j];
            colSum[j] -= valid[i][j];

            if(rowSum[i] == 0)
            {
                i++;
            }
            if(colSum[j] == 0)
            {
                j++;
            }
            
        }

        return valid;
    }
}