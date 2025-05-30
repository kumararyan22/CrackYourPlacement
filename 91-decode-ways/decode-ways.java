class Solution {
    int[] dp;
    public int numDecodings(String s) {
        int n = s.length();

         dp = new int[n+1];
         for(int i=0; i<=n; i++)
         {
            dp[i] = -1;
         }

        return solve(s,n,0);

        
    }

    public int solve(String s, int n, int idx)
    {
        if(idx == n)
        {
            return dp[idx] = 1;
        }

        if(s.charAt(idx) == '0')
        {
            return dp[idx] = 0;
        }

        if(dp[idx] != -1)
        {
            return dp[idx];
        }

        int oneStep = solve(s,n,idx+1);
        int twoStep = 0;

        if(idx < n-1)
        {
            if(s.charAt(idx) == '1' || s.charAt(idx) == '2' && s.charAt(idx+1) <= '6')
            {
               twoStep = solve(s,n,idx+2);
            }
        }

        dp[idx] = oneStep + twoStep;

        return dp[idx];
    }
}