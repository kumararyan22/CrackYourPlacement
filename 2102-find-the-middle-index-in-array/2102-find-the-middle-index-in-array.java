class Solution {
    public int findMiddleIndex(int[] nums) {
          
          int n = nums.length;
          int sum = 0;
          for(int i=0; i<n; i++)
          {
            sum += nums[i];
          }
          
          int leftSum = 0;
          int rightSum = 0;
          
          for(int i=0; i<n; i++)
          {
             rightSum = sum - leftSum - nums[i];
             if(leftSum == rightSum)
             {
                return i;
             }

             leftSum += nums[i];
          }

          return -1; 
    }
}