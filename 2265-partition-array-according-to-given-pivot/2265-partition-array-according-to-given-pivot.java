class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int i=0;
        int[] ans = new int[n];
        int idx = 0;

        while(i < n)
        {
            if(nums[i] < pivot)
            {
                ans[idx++] = nums[i];
            }
            i++;
        }

        i = 0;
        while(i < n)
        {
            if(nums[i] == pivot)
            {
                ans[idx++] = nums[i];
            }
            i++;
        }

        i = 0;
        while(i < n)
        {
            if(nums[i] > pivot)
            {
                ans[idx++] = nums[i];
            }
            i++;
        }


        return ans;

        
    }
}