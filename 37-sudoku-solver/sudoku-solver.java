
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) 
                    {
                        if (isValid(board, i, j, num)) 
                        {
                            board[i][j] = num;
                            if (solve(board)) 
                            {
                                return true;
                            } 
                            else 
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true; // puzzle solved
    }

    private boolean isValid(char[][] board, int row, int col, char num) 
    {
        for (int i = 0; i < 9; i++) 
        {
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
            if (board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == num) return false;
        }
        return true;
    }
}
