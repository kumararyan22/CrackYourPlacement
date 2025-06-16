class Solution {
    public int maximumDifference(int[] nums) {
        
        int n = nums.length;
        int max = 0;

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i] < nums[j])
                {
                    max = Math.max(max , nums[j] - nums[i]);
                }
            }
        }

        return max == 0 ? -1 : max;
    }
}