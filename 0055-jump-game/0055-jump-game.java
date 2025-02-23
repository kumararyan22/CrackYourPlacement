class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        int max_idx = 0;

        for(int i=0; i<n; i++)
        {
            if(i > max_idx)
            {
                return false;
            }

            max_idx = Math.max(max_idx , i + nums[i]);
        }

        return true;
    }
}