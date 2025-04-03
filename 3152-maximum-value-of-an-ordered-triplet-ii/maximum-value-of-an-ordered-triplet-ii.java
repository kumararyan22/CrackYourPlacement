class Solution {
    public long maximumTripletValue(int[] nums) {
        
        int n = nums.length;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        

        prefix[0] = nums[0];
        for(int i=1; i<n; i++)
        {
             prefix[i] = Math.max(prefix[i-1] , nums[i]);
        }

        suffix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--)
        {
            suffix[i] = Math.max(suffix[i+1] , nums[i]);
        }


        long ans = 0;
        for(int j=1; j<n-1; j++)
        {
            ans = Math.max(ans , (prefix[j-1] - nums[j]) * suffix[j+1]);
        }
    
        return ans;
    }
}