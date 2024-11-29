class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1)   //base case - 1
        {
            return s;
        }

        StringBuilder sb = new StringBuilder();  //faster
        
        for(int i=0; i<numRows; i++)   //row by row check
        {
            int idx = i;  //first character first row always include
            int southCount = 2 * (numRows - 1 - i);   //dry run best understood
            int northCount = 2 * i;

            boolean toggle = true;

            while(idx < s.length())
            {
                sb.append(s.charAt(idx));   //base case - 2

                if(i == 0)  //for the first row 
                {
                    idx += southCount;
                }
                else if(i == numRows-1)  //for the last row
                {
                    idx += northCount;
                }
                else  //otherwise middle row
                {
                    if(toggle == true)
                    {
                        idx += southCount;
                    }
                    else
                    {
                        idx += northCount;
                    }

                    toggle = !toggle;
                }

            }
        }

        return sb.toString();
    }
}