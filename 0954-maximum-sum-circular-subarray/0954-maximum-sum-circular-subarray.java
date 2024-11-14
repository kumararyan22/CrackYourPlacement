class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        //1
        int n = nums.length;
        int totalSum = 0;
        for(int i=0; i<n; i++)
        {
            totalSum += nums[i];
        }

        //2
        int maxSum = KadanesMax(nums , n);

        //3
        int minSum = KadanesMin(nums , n);

        //4
        int circular_Sum = totalSum - minSum;
        
        if(circular_Sum > 0)
        {
            return Math.max(circular_Sum , maxSum);
        }

        return maxSum;

    }


    public int KadanesMax(int[] nums , int n)
    {
        int sum = 0;
        int max = nums[0];

        for(int i=0; i<n; i++)
        {
            sum += nums[i];
            if(sum > max)
            {
                max = sum;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }

    public int KadanesMin(int[] nums , int n)
    {
        int sum = 0;
        int min = nums[0];

        for(int i=0; i<n; i++)
        {
            sum += nums[i];
            if(sum < min)
            {
              min = sum;
            }

            if(sum > 0)
            {
              sum = 0;
            }
        }
        return min;
    }
}