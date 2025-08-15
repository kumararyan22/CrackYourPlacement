class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n == 1)
        {
            return true;
        }

        long num = 1;

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