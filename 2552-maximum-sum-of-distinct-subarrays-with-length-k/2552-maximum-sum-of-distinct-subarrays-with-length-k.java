class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        int i=0;
        int j=0;
        long currSum = 0;
        long max = 0;

        while(j < n)
        {
            while(set.contains(nums[j]))
            {
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            currSum += nums[j];
            set.add(nums[j]);

            if(j-i+1 == k)
            {
                max = Math.max(max , currSum);

                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            j++;
        }
      
      return max;
    }
}