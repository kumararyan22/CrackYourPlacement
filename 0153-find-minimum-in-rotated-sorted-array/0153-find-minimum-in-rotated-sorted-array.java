class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) 
        {
            int mid = start + (end - start) / 2;

            // If the middle element is greater than the rightmost element, 
            // the minimum must be in the right half
            if (nums[mid] > nums[end]) 
            {
                start = mid + 1;
            } 
            // Otherwise, the minimum is in the left half, or it could be the mid itself
            else 
            {
                end = mid;
            }
        }
        
        // After the loop, start will point to the minimum element
        return nums[start];
    }
}
