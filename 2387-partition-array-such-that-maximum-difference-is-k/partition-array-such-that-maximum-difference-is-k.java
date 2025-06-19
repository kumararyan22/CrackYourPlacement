class Solution {
    public int partitionArray(int[] nums, int k) {
        
        int n = nums.length;   //very simple, solved it yourself
         

        Arrays.sort(nums);
        int count = 1;
        int min = nums[0]; //assume first value is minimum

        for(int i=1; i<n; i++)
        {

           if(nums[i]-min > k)
           {
            count++;
            min = nums[i];
           }
           else
           {
            continue;
           }
        }

        return count;
    }
}