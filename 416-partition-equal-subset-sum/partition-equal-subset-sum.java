class Solution {
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += nums[i];
        }

        if(sum % 2 != 0)
        {
            return false;
        }

        return subsetSum(nums , n, sum/2);
    }

    public boolean subsetSum(int[] nums, int n, int sum)
    {
        boolean[][] tb = new boolean[n+1][sum+1];

        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=sum; j++)
            {
                if(j == 0)
                {
                    tb[i][j] = true;
                }
                else if(i == 0)
                {
                    tb[i][j] = false;
                }
            }
        }

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=sum; j++)
            {
                if(nums[i-1] <= j)
                {
                    tb[i][j] = tb[i-1][j-nums[i-1]] || tb[i-1][j];
                }
                else
                {
                    tb[i][j] = tb[i-1][j];
                }
            }
        }

        return tb[n][sum];
    }
}