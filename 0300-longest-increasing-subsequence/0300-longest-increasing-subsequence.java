class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        return solve(nums , 0 , -1 , n , dp);
    }
    
    public static int solve(int[] nums , int i , int p , int n , int[][] dp)
    { 
        if(i >= n)    //base case , no add element further
        {
            return 0;
        }

        if(dp[i][p+1] != -1)    //p+1 , bcz p start -1 so +1 add the p
        {
            return dp[i][p+1];
        }

        int take = 0;
        if(p == -1 || nums[i] > nums[p])
        {
            take = 1 + solve(nums,i+1,i,n,dp);
        }

        int skip = solve(nums,i+1,p,n,dp);   //increse the i value but end value same (p)

        dp[i][p+1] = Math.max(take , skip);   // the add dp , when return function call
        return dp[i][p+1];


    }

}