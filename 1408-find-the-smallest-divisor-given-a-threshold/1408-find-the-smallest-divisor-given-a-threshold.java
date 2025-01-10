class Solution {
    public int isCheck(int[] nums , int mid)
    {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        {
           sum += Math.ceil((double)nums[i] / (double)mid);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        
        int n = nums.length;
        if(n > threshold)
        {
            return -1;
        }

        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;

        for(int i=0; i<n; i++)
        {
            high = Math.max(high , nums[i]);
        }

        while(low <= high)
        {
            int mid = low+(high-low)/2;

            if(isCheck(nums,mid) <= threshold)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}