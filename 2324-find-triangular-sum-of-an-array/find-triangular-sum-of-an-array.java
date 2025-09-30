class Solution {
    public int triangularSum(int[] nums) {
        
        int n=nums.length;
        
        while(n > 1)
        {
            for(int i=0; i<n-1; i++)
            {
                int first = nums[i];
                int second = nums[i+1];
                int val = (first + second) % 10;
                nums[i] = val;
            }
            n--;
        }

        return nums[0];
    }
}