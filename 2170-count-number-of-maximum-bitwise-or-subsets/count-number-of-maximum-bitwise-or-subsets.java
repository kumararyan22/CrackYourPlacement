class Solution {
    int count=0;
    public int countMaxOrSubsets(int[] nums) {
        
        int n=nums.length;
        int maxOr = 0;

        for(int num : nums)
        {
            maxOr |= num;
        }

        helper(nums,0,0,maxOr);
        return count;

    }

    public void helper(int[] nums, int idx, int currentOr, int maxOr)
    {
        if(idx == nums.length)
        {
            if(currentOr == maxOr)
            {
                count++;
            }
            return;
        }

        helper(nums,idx+1,currentOr|nums[idx],maxOr);

        helper(nums,idx+1,currentOr,maxOr);
    }
}