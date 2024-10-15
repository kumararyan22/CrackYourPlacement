class Solution {
    public long minimumSteps(String s) {
        
        int n = s.length();
        long swap = 0;

        int last = 0;

        for(int curr = 0; curr < n; curr++)
        {
            if(s.charAt(curr) == '0')
            {
                swap += (curr - last);
                last++;
            }
            else
            {
                continue;
            }
        }

        return swap;
    }
}