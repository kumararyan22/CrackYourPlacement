class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length;
        int max = 0;
        int countOne = 0;

        for(int i=0; i<n; i++)
        {
            if(nums[i] == 1)
            {
                countOne++;
            }
            else
            {
                countOne = 0;
            }
            max = Math.max(max , countOne);
        }

        return max;

    }
}