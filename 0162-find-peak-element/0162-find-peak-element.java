class Solution {
    public int findPeakElement(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start < end)
        {
            int mid = start + (end-start)/2;   //mid find

            if(nums[mid] < nums[mid+1])  //5 < 6 , so increse start only
            {
                start = mid + 1;  //store
            }
            else
            {
                end = mid;   //if both same so end value initialize mid
            }
        }

        return start;
    }
}