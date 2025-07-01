class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        

        //first approach , full same code template is , subarray sum equal k

        //second approach , sliding window , only some changes full khandani template follow
        
        int n = nums.length;
        int i=0;
        int j=0;
        int preCount = 0;
        int oddCount = 0;
        int result = 0;

        while(j < n)
        {
            if(nums[j] % 2 != 0)
            {
                oddCount++;
                preCount = 0;
            }

            while(i < n && oddCount == k)
            {
                preCount++;

                if(nums[i] % 2 != 0)
                {
                    oddCount--;
                }
                i++;
            }

            result += preCount;

            j++;
        }

        return result;

    }
}