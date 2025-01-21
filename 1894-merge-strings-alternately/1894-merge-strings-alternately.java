class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n1 = word1.length();
        int n2 = word2.length();
        int i=0;
        int j=0;

        boolean toggle = true;

        String ans = "";

        while(i < n1 && j < n2)
        {
            if(toggle == true)
            {
                ans += word1.charAt(i);
                i++;
            }
            else
            {
                ans += word2.charAt(j);
                j++;
            }
            
            toggle = !toggle;
        }

        while(i < n1)
        {
            ans += word1.charAt(i);
            i++;
        }
        while(j < n2)
        {
            ans += word2.charAt(j);
            j++;
        }

        return ans;
    }
}