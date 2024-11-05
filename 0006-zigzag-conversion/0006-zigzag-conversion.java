class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1)
        {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numRows; i++)
        {
            int idx = i;
            int southCount = 2 * (numRows - 1 - i);
            int northCount = 2 * i;
            boolean toggle = true;

            while(idx < s.length())
            {
                sb.append(s.charAt(idx));

                if(i == 0)
                {
                    idx += southCount;
                }
                else if(i == numRows-1)
                {
                    idx += northCount;
                }
                else
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