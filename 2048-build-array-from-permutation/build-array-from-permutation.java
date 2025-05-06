class Solution {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;
        if(n == 0 || n == 1)
        {
            return nums;
        }
        
        int[] res = new int[n];

        for(int i=0; i<n; i++)
        {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}