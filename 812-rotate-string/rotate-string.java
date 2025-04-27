class Solution {
    public boolean rotateString(String s, String goal) {
        
        int n = s.length();
        int m = goal.length();

        if(n != m)
        {
            return false;
        }

        for(int k=0; k<n; k++)
        {
            int i=0;

            while(i < n && s.charAt(i) == goal.charAt((i+k)%n))
            {
                i++;
            }

            if(i == n)
            {
                return true;
            }
        }

        return false;
    }
}