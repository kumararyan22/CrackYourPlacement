class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int n=nums.length;
        int lessCount=0;
        int pivotCount=0;

        for(int i=0; i<n; i++)
        {
            if(nums[i] < pivot)
            {
                lessCount++;
            }
            else if(nums[i] == pivot)
            {
                pivotCount++;
            }
        }

        int[] ans = new int[n];
        int less=0;
        int mid=lessCount;   //where the lessCount is ending.
        int high=high=lessCount + pivotCount;    //where the both ending(less or equal), it means remaning all element is high from pivot.

        for(int i=0; i<n; i++)
        {
            if(nums[i] < pivot)
            {
                ans[less++] = nums[i];
            }
            else if(nums[i] > pivot)
            {
                ans[high++] = nums[i];
            }
            else
            {
                ans[mid++] = nums[i];
            }
        }

        return ans;
    }
}