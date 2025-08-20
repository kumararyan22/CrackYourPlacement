class Solution {

    int[][] dp = new int[300][300];  // Declare dp array for memoization
    int ans = 0;

    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;


        // Compute the result by checking all elements of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 1)
                {
                ans += countSquaresHelper(matrix, i, j);
                }
            }
        }

        return ans;
    }

    // Helper function for memoization
    private int countSquaresHelper(int[][] matrix, int i, int j) 
    {
         
         int m = matrix.length;
         int n = matrix[0].length;

        if (i>= m || j>= n || matrix[i][j] == 0) {
            return 0;
        }

        // If the value is already calculated, return the stored result
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        int l = countSquaresHelper(matrix , i , j+1);  //for row
        int r = countSquaresHelper(matrix , i+1 , j);  //for colum
        int t = countSquaresHelper(matrix , i+1 , j+1);  //for diagonal

        ans = 1 + Math.min(l , Math.min(r,t));
        dp[i][j] = ans;

        return dp[i][j];
    }
}
