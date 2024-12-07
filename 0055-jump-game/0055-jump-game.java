class Solution {
    public boolean canJump(int[] nums) {

        int currentIdx = nums.length-1;

        for(int i=currentIdx; i>=0; i--)
        {
            if(nums[i]+i >= currentIdx)
            {
                currentIdx = i;     //dry run best 
            }
        }
        if(currentIdx == 0)
        {
            return true;
        }

        return false;
        
    }
}