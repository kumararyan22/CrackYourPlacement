class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int idx = 0;
        int lastIdx = n-1;

        for(int i=0; i<n; i++)
        {
            if(nums[i] % 2 == 0)
            {
                ans[idx++] = nums[i];
            }
            else
            {
                ans[lastIdx--] = nums[i];
            }
        }

        return ans;
    }
}