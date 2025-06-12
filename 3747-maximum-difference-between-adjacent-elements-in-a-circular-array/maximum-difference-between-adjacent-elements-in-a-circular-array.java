class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int i=0;

        while(i < n)
        {
            
            if(i == n-1)
            {
                int j = i/n;
                max= Math.max(max , Math.abs(nums[i] - nums[j]));
            }
            else
            {
                max = Math.max(max , Math.abs(nums[i] - nums[i+1]));
            }
            i++;

        }

        return max;
    }
}