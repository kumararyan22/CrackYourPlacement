class Solution {
    int m,n;
    int[][] dp = new int[501][501];

    public int minDistance(String word1, String word2) {
        
         m = word1.length();
         n = word2.length();

        for(int[] t : dp)
        {
            Arrays.fill(t, -1);
        }

        return solve(word1, word2, 0, 0);
    }

    public int solve(String word1, String word2, int i, int j)
    {
        if(i == m)
        {
            return n-j;   //insert character
        }
        else if(j == n)
        {
            return m-i;  //delete character
        }

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        if(word1.charAt(i) == word2.charAt(j))
        {
            return dp[i][j] = solve(word1, word2, i+1, j+1);
        }
        else
        {
            int insertC = 1 + solve(word1, word2, i, j+1);
            int deleteC = 1 + solve(word1, word2, i+1, j);
            int replaceC = 1 + solve(word1, word2, i+1, j+1);

            return dp[i][j] = Math.min(insertC, Math.min(deleteC, replaceC));
        }

        
    }
}