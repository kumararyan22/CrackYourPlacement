class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m*n];
        int idx=0;

        int row=0;
        int col=0;

        boolean up = true;

        while(row < m && col < n)
        {
            if(up == true)  //for up
            {
                while(row > 0 && col < n-1)
                {
                    ans[idx++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[idx++] = mat[row][col];
                if(col == n-1)
                {
                    row++;
                }
                else
                {
                   col++;
                }
            }

            else  //for down
            {
                while(row < m-1 && col > 0)
                {
                    ans[idx++] = mat[row][col];
                    row++;
                    col--;
                }
                ans[idx++] = mat[row][col];
                if(row == m-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }
            }

            up = !up;

        }

        return ans;

    }
}