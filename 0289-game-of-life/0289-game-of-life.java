class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] clone = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                clone[i][j] = board[i][j];
            }
        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(clone[i][j] == 1)
                {
                    int live = findLive(i,j,m,n,clone);
                    if(live == 2 || live == 3)
                    {
                        board[i][j] = 1;
                    } 
                    else
                    {
                        board[i][j] = 0;
                    }
                }
                else
                {
                    if(findLive(i,j,m,n,clone) == 3)
                    {
                        board[i][j] = 1;
                    }
                    else
                    {
                        board[i][j] = 0;
                    }
                }
            }
        }
    }


        private int findLive(int i, int j, int m, int n, int[][] board)
        {
            int live = 0;
            if(i+1 < m && board[i+1][j] == 1) live++;
            if(j+1 < n &&  board[i][j+1] == 1) live++;
            if(i-1 >= 0 && board[i-1][j] == 1) live++;
            if(j-1 >= 0 && board[i][j-1] == 1) live++;

            if(i+1 < m && j+1 < n && board[i+1][j+1] == 1) live++;
            if(i+1 < m && j-1 >= 0 && board[i+1][j-1] == 1) live++;
            if(i-1 >= 0 && j+1 < n && board[i-1][j+1] == 1) live++;
            if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) live++;

            return live;
        }
}