class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return solve(nums,target,0,0);
    }

    public static int solve(int[] nums, int target, int index, int currSum)
    {
        if(index == nums.length)
        {
            if(currSum == target)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        int plus = solve(nums, target, index+1, currSum + nums[index]);
        int minus = solve(nums, target, index+1, currSum - nums[index]);

        return plus + minus;
    }
}