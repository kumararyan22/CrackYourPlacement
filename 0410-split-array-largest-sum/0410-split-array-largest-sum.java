class Solution {
    public int splitArray(int[] nums, int k) {
        
        int n =nums.length;

        int start = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
           start = Math.max(start , nums[i]);
        }

        int end = 0;
        for(int i=0; i<n; i++)
        {
            end += nums[i];
        }


        int result = -1;

        while(start <= end)
        {
            int maxMid = start + (end - start)/2;

            if(isValid(nums,n,k,maxMid) == true)
            {
                 result = maxMid;
                 end = maxMid - 1;
            }
            else
            {
                start = maxMid + 1;
            }
        }

        return result;

    }


    public static boolean isValid(int[] nums , int n , int k, int maxMid)
    {
        int part = 1;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += nums[i];
            if(sum > maxMid)
            {
                part++;
                sum = nums[i];
            }

            if(part > k)
            {
                return false;
            }
        }

        return true;
    }
}