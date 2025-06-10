class Solution {
    public int minDistance(String word1, String word2) {
        
        int m = word1.length();
        int n = word2.length();

        int deletion1 = m-lcs(word1,word2,m,n);
        int deletion2 = n-lcs(word1,word2,m,n);

        int res = deletion1 + deletion2;
        return res;
    }

    public int lcs(String word1, String word2, int m, int n)
    {
        int[][] dp = new int[m+1][n+1];
        for(int[] d1 : dp)
        {
            Arrays.fill(d1 , -1);
        }

        return helper(word1,word2,m,n,dp);
        
    }

    public int helper(String word1, String word2, int m, int n, int[][] dp)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(dp[m][n] != -1)
        {
            return dp[m][n];
        }

        if(word1.charAt(m-1) == word2.charAt(n-1))
        {
            return dp[m][n] = 1 + helper(word1,word2,m-1,n-1,dp);
        }
        else
        {
            return dp[m][n] = Math.max(helper(word1,word2,m-1,n,dp) , 
                                      helper(word1,word2,m,n-1,dp));
        }
    }
}