class Solution {
    public int minSwaps(String s) {
        
        int n = s.length();
        if(n == 0)
        {
            return 0;
        }
        
        int open = 0;
        int close = 0;
        
        int swap = 0;

        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == '[')
            {
                 open++;
            }

            else if(s.charAt(i) == ']')
            {
                 close++;
                
            }

            if(close > open)
            {
                swap++;
                close--;
                open++;
            }
        }
        return swap;
    }
}