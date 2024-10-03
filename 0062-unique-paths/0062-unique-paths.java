class Solution {
    int[][] dp = new int[101][101];

    public int uniquePaths(int m, int n) {
        
        for(int[] dp1 : dp)
        {
            Arrays.fill(dp1 , -1);
        }

        return recur(m,n,0,0);
    }

    public int recur(int m , int n , int i , int j)
    {
        if(i >= m || j >= n)
        {
            return 0;
        }

        if(i == m-1 && j == n-1)
        {
            return 1;
        }

        if(dp[i][j] != -1)
        {
             return dp[i][j];
        }

        int right = recur(m,n,i,j+1);
        int down = recur(m,n,i+1,j);

        dp[i][j] = right + down;

        return dp[i][j];
    }
}