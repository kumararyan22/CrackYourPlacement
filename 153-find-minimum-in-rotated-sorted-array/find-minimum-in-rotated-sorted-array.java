class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int res = Integer.MAX_VALUE;

        while (start <= end) 
        {
            int mid = start + (end - start) / 2;
             
            if(nums[start] <= nums[end])   //if full code sorted 
            {
                res = Math.min(res , nums[start]);    //first value(lowest value) store then break
                break;
            }


            if(nums[start] <= nums[mid])   //if left part sorted
            {
                res = Math.min(res , nums[start]);
                start = mid + 1;
            }
            else   //if right part sorted
            {
                res = Math.min(res , nums[mid]);    //mid value(lowest value) store
                end = mid - 1;
            }
        }

        return res;
    }
}
