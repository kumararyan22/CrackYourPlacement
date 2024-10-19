class Solution {
    
    int[] dp ;

    public int numTrees(int n) {
        
        dp = new int[n+1];
        for(int i=0; i<=n; i++)
        {
            dp[i] = -1;
        }

        return solveBST(n);
    }

    public int solveBST(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        if(dp[n] != -1)
        {
            return dp[n];
        }
        
        int ans = 0;
        for(int i=1; i<=n; i++)
        {
            ans += solveBST(i-1) * solveBST(n-i);
        }

        return dp[n] = ans;
        
    }
}