class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int countOne=0;

        while(n > 0)
        {
            if((n & 1) == 1)
            {
                countOne++;
            }
            n = n >> 1;
        }

        if(countOne == 1)
        {
            return true;
        }

        return false;
    }
}