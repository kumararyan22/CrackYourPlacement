class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        // int n = nums.length;
        // long ans = 0;

        // for(int i=0; i<n; i++)
        // {
        //     long sum = 0;
        //     int count = 0;

        //     for(int j=i; j<n; j++)
        //     {
        //         sum += nums[j];
        //         count++;

        //         if((sum * count) < k)
        //         {
        //             ans++;
        //         }
    
        //     }

        // }

        // return ans;


        int n = nums.length;
        int i = 0;
        int j = 0;
        long sum = 0;
        long ans = 0;
        int count = 0;

        while (j < n) {
            sum += nums[j];
            count++;

            while (i <= j && (sum * count) >= k)
            {
                sum -= nums[i];
                count--;
                i++;
            }

            ans += (j - i + 1);
            j++;
        }

        return ans;
    }
}
