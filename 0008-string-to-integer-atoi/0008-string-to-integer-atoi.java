class Solution {
    public int myAtoi(String s) {
        
        int n = s.length();
        int sigh = 1;
        int idx = 0;
        long res = 0;

        while(idx < n && s.charAt(idx) == ' ')
        {
            idx++;
        }

        if(idx < n && (s.charAt(idx) == '-' || s.charAt(idx) == '+'))
        {
             if(s.charAt(idx) == '-')
             {
                 sigh = -1;
             }
             idx++;
        }

        while(idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9')
        {
            res = res*10 + (s.charAt(idx) - '0');

            if(sigh*res >= Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sigh*res <= Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }

            idx++;
        }

        return (int) (sigh*res);

    }
}