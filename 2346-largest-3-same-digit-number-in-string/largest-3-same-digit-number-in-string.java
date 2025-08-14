class Solution {
    public String largestGoodInteger(String num) {
        
         String s ="";
         
         for(int i=0; i<=num.length()-3; i++)
         {
            int count=0;
            String curr="";
            for(int j=i; j<num.length(); j++)
            {
                if(num.charAt(i) == num.charAt(j))
                {
                    count++;

                    if(count == 3)
                    {
                        curr = String.valueOf(num.charAt(i)).repeat(3);
                    }
                }
                else
                {
                    count =0;
                }
            }
            if(curr.compareTo(s) > 0)
            {
                s = curr;
            }
         }

         return s;
    }
}