class Solution {

    public int firstPosition(int[] nums , int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int result = -1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid] == target)
            {
                result = mid;
                end = mid-1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return result;
    }


    public int lastPosition(int[] nums , int target)
    {
        
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int result = -1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid] == target)
            {
                result = mid;
                start = mid+1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return result;

    }


    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        
        result[0] = firstPosition(nums , target);   //function calling
        result[1] = lastPosition(nums , target);

        return result;
        
    }
}