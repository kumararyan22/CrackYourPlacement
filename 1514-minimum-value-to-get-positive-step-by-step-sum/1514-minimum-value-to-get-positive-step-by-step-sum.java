class Solution {
    public int minStartValue(int[] nums) {
        
        // int n = nums.length;    //first approach solved
        // int init = 1;
        // int currSum = 1;

        // for(int i=0; i<n; i++)
        // {
        //     currSum += nums[i];
        //     if(currSum < 1)
        //     {
        //         int delta = 1 - currSum;
        //         currSum += delta;
        //         init += delta;
        //     }
        // }

        // return init;

        int n = nums.length;      //second approach solved
        int prefix = 0;
        int minPrefSum = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            prefix += nums[i];
            minPrefSum = Math.min(minPrefSum , prefix);
        }

        if(minPrefSum < 1)
        {
            return 1 - minPrefSum;
        }

        return 1;

    }
}