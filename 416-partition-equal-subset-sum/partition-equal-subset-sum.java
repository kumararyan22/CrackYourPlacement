class Solution {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        int totalSum = 0;

        for(int i=0; i<n; i++)
        {
            totalSum += nums[i];
        }

        if(totalSum % 2 != 0)
        {
            return false;
        }
        else
        {
            return helper(nums,totalSum / 2);
        }
    }

    public boolean helper(int[] nums,int sum)
    {
        int n = nums.length;
        dp = new Boolean[n+1][sum+1];

        return solveSubset(nums,n,sum);

    }

    public boolean solveSubset(int[] nums, int n, int sum)
    {
        if(sum == 0)
        {
            return true;
        }
        if(n == 0)
        {
            return false;
        }

        if(dp[n][sum] != null)
        {
            return dp[n][sum];
        }

        if(nums[n-1] <= sum)
        {
            dp[n][sum] = solveSubset(nums,n-1,sum-nums[n-1]) || solveSubset(nums,n-1,sum);
        }
        else
        {
            dp[n][sum] = solveSubset(nums,n-1,sum);
        }

        return dp[n][sum];
    }
}