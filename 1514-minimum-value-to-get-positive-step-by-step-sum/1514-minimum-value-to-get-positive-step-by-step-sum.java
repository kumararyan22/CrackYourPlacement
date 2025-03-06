class Solution {
    public int minStartValue(int[] nums) {
        
        int n = nums.length;
        int init = 1;
        int currSum = 1;

        for(int i=0; i<n; i++)
        {
            currSum += nums[i];
            if(currSum < 1)
            {
                int delta = 1 - currSum;
                currSum += delta;
                init += delta;
            }
        }

        return init;
    }
}