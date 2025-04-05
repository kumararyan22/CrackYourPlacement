class Solution {
    public int subsetXORSum(int[] nums) {
        
        return solve(0 , nums , 0);
    }

    public int solve(int xorSum , int[] nums, int i)
    {
        if(i == nums.length)
        {
            return xorSum;
        }

        int include = solve(xorSum^nums[i] , nums , i+1);
        int exclude = solve(xorSum , nums , i+1);

        return include + exclude;
    }
}