class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        // int n = nums.length;            //brute force
        // int[] ans = new int[n];

        // for(int i=0; i<n; i++)
        // {
        //     int absSum = 0;
        //     for(int j=0; j<n; j++)
        //     {
        //         absSum += Math.abs(nums[i] - nums[j]);
        //     }
        //     ans[i] = absSum;

        // }

        // return ans;



        int n = nums.length;       //optimal approach
        int[] ans = new int[n];

        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += nums[i];
        }

        int preSum = 0;
        for(int i=0; i<n; i++)
        {
            int leftSum = preSum;
            int rightSum = sum - preSum - nums[i];

            ans[i] = (nums[i] * i) - leftSum + rightSum - (nums[i]*(n-i-1));

            preSum += nums[i];
        }

        return ans;
    }
}