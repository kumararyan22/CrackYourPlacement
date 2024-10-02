class Solution {

    int[][][] dp = new int[101][101][601];

    public int findMaxForm(String[] strs, int m, int n) {
        
        for(int[][] d1 : dp)
        {
            for(int[] d2 : d1)
            {
                 Arrays.fill(d2 , -1);
            }
        }

        return recur(strs , m , n , 0);
    }

    public int recur(String[] strs , int m , int n , int i)
    {
        if(i >= strs.length || m < 0 || n < 0)
        {
            return 0;
        }

        if(dp[m][n][i] != -1)
        {
            return dp[m][n][i];
        }

        int zeros = 0;
        int ones = 0;

        for(char c : strs[i].toCharArray())
        {
            if(c == '0')
            {
                zeros++;
            }
            else
            {
                ones++;
            }
        }


        if(m - zeros >= 0 && n - ones >= 0)
        {
            dp[m][n][i] = Math.max(1 + recur(strs,m-zeros,n-ones,i+1) , recur(strs,m,n,i+1));
        }
        else
        {
            dp[m][n][i] = recur(strs,m,n,i+1);
        }

        return dp[m][n][i];
    }
}