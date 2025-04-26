
class Solution {
    // int max = 0;   //globaly define
    // int start = 0;
    // int end = 0;

    public boolean isPalindrome(String s , int i , int j)   //function calling  
    {
         
       while(i < j)   // i, j  value for loop given
       {
        if(s.charAt(i) != s.charAt(j))
        {
            return false;
        }
        i++;
        j--;
       }

       return true;
    }


    public String longestPalindrome(String s) {
        
        int n = s.length();
        int max = 0;
        int start=0;
        int end=0;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(isPalindrome(s,i,j) == true)
                {
                    if(j-i+1 > max)    //j-i+1 length of string
                    {
                       max = j-i+1;  
                       start = i;   //update 
                       end = j;
                    }
                }
            }
        }
        return s.substring(start , end+1);   //bcz they are not include last character so +1 add
    }
}
