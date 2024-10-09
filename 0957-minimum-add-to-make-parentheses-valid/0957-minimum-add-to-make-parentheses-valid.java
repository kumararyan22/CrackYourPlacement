class Solution {
    public int minAddToMakeValid(String s) {

        int n = s.length();
        int open = 0;
        int close = 0;

        if(n == 0)   //base case
        {
            return 0;
        }

        for(int i=0; i<n; i++) 
        {
            if(s.charAt(i) == '(')   //if find open bracket so increment open( 0 + 1 = 0)
            {
                open++;
            }
            else if(s.charAt(i) == ')')   //else if find close bracket and check already open breaket 0 greater than 
            {
                if(open > 0)
                {
                    open--;   //decrement open number
                }
                else
                {
                    close++;   //otherwise
                }
            }
        }

        return open + close;   //final 
        
    }
}