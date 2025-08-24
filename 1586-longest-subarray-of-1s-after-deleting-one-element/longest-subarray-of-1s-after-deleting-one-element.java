class Solution {
    public int longestSubarray(int[] nums) {
        
        int n=nums.length;
        int max = 0;
        int i=0;
        int j=0;
        int countZero=0;
        int countOne=0;

        int one=0;
        for(int p=0; p<n; p++)
        {
            if(nums[p]==1)
            {
                one++;
            }
        }

        if(one==n)
        {
            return one-1;
        }
       
        while(j<n)
        {
           if(nums[j]==0)
           {
            countZero++;
           }
           if(nums[j]==1)
           {
            countOne++;
           }

           while(i<n && countZero > 1)
           {
             if(nums[i]==0)
             {
              countZero--;
             }
             else if(nums[i]==1)
             {
              countOne--;
             }
             i++;
           }

           max = Math.max(max , countOne);
           j++;
        }

        return max;
    }
}