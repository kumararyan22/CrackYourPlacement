class Solution {
    public int longestValidParentheses(String s) {
        
        int max1 = 0;
        int open = 0;
        int close = 0;

        for(int i=0; i<s.length(); i++)    //forword iterate
        {
            if(s.charAt(i) == '(')    //dry run very simple
            {
                open++;
            }
            else
            {
                close++;
            }

            if(close > open)     //close > open
            {
                open = 0;
                close = 0;
            }
            else if(open == close)
            {
                max1 = Math.max(max1 , open*2);
            }
        }


        int max2 = 0;
        open = 0;
        close = 0;

        for(int i=s.length()-1; i>=0; i--)    //backword iterate
        {
            if(s.charAt(i) == '(')
            {
                open++;
            }
            else
            {
                close++;
            }

            if(open > close)   //open > close
            {
                open = 0;
                close = 0;
            }
            else if(open == close)
            {
                max2 = Math.max(max2 , open*2);
            }
        }


        return Math.max(max1 , max2);
    }
}