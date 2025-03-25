class Solution {
    public int specialArray(int[] nums) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int x = 1;

        while(x <= n)
        {
            int count = 0;
            for(int num : nums)
            {
                if(num >= x)
                {
                    count++;
                }
            }

            if(x == count)
            {
                return x;
            }

            x++;
        }

         return -1;

    }
}