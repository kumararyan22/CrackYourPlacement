class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int n = nums.length;
        int maxsum = 0;
        int minsum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<n; i++)
        {
            sum1 += nums[i];
            sum2 += nums[i];

            maxsum = Math.max(maxsum , sum1);
            minsum = Math.min(minsum , sum2);

            if(sum1 < 0)
            {
                sum1 = 0;
            }
            if(sum2 > 0)
            {
                sum2 = 0;
            }
        }

        return Math.max(maxsum , Math.abs(minsum));
    }
}