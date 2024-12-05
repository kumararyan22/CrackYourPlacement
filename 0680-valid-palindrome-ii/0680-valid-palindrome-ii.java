class Solution {
    public boolean validPalindrome(String s) {
        
        if(s.isEmpty())
        {
            return true;
        }

        int i=0;
        int j=s.length()-1;

        while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);  //given true or false
            }
            i++;
            j--;
        }

        return true;
    }

    private static boolean isPalindrome(String s , int i , int j)
    {
        while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;   //return true or false of isPalindrome
    }
}