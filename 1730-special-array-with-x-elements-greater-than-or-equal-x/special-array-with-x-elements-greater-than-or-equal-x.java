class Solution {
    public int specialArray(int[] nums) {
        
        // Arrays.sort(nums);    //brute force
        int n = nums.length;
        int x = 1;

        while(x <= n)    //bcz , its last value will go upto n length
        {
            int count = 0;
            for(int num : nums)   //one by one check for last value not till
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

            x++;  //otherwise increment 
        }

         return -1;

    }
}