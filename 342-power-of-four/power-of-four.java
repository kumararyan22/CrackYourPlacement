class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n == 1)
        {
            return true;
        }
         
        // if(n > 1 && n < 16)
        // {
        //     return false;
        // }

        // int count=0;

        // while(n > 0)
        // {
        //     if((n & 1) == 1)
        //     {
        //         count++;
        //     }

        //     n = n >> 1;
        // }

        // if(count % 2 != 0)
        // {
        //     return true;
        // }

        // return false;

        long num = 4;

        while(n > num)
        {
            num = num * 4;
        }

        if(num == n)
        {
            return true;
        }

        return false;
    }
}