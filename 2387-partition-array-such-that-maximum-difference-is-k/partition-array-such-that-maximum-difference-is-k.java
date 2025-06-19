class Solution {
    public int partitionArray(int[] nums, int k) {
        
        int n = nums.length;   //very simple, solved it yourself
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Arrays.sort(nums);
        int count = 1;

        for(int i=0; i<n; i++)
        {
           min = Math.min(min , nums[i]);
           max = Math.max(max , nums[i]);

           if(max - min > k)
           {
            count++;
            min = nums[i];
            max = nums[i];
           }
          
        }

        return count;
    }
}