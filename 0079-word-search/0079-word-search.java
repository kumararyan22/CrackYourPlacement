class Solution {
    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        boolean[][] vis = new boolean[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(solveWord(board , word , 0 , i , j ,vis))
                {
                    return true;
                }
            }
        }
        return false;
        
    }

    public boolean solveWord(char[][] board , String word , int start , int r , int c , boolean[][] vis)
    {
        if(start == word.length())
        {
            return true;
        }

        if(r<0 || r>= board.length || c<0 || c>=board[0].length || vis[r][c] || board[r][c] != word.charAt(start))
        {
            return false;
        }
         
        vis[r][c] = true;
        boolean found = solveWord(board,word,start+1,r-1,c,vis) ||
                        solveWord(board,word,start+1,r+1,c,vis) ||
                        solveWord(board,word,start+1,r,c-1,vis) ||
                        solveWord(board,word,start+1,r,c+1,vis);

                        vis[r][c] = false;

                        return found;
    }
}

