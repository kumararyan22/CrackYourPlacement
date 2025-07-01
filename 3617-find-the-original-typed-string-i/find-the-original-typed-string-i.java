class Solution {
    public int possibleStringCount(String word) {
        
        int n = word.length();
        int ans =0;
        int j=0;

        while(j < n-1)
        {
            if(word.charAt(j) == word.charAt(j+1))
            {
                int count = 0;
                while(j < n-1 && word.charAt(j) == word.charAt(j+1))
                {
                    count++;
                    j++;
                }
                ans += count;
            }

            j++;

        }

        return ans+1;
    }
}