class Solution {
    public boolean validPalindrome(String s) {
        
        int n = s.length();
        if(n == 0)
        {
            return true;
        }

        int i=0;
        int j=n-1;

        while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindrome(String s, int start, int end)
    {
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}