class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int totalSum = 0;

        for(int i=0; i<n; i++)
        {
            totalSum += nums[i];
        }

        int leftsum = 0;
        int rightsum = 0;

        for(int i=0; i<n; i++)
        {
            rightsum = totalSum - leftsum - nums[i];

            if(leftsum == rightsum)
            {
                return i;
            }

            leftsum += nums[i];
        }

        return -1;
    }
}