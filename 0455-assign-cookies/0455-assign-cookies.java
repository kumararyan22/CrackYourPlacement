class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n1 = g.length;
        int n2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);

        int l=0;
        int r=0;
        int count = 0;

        while(l < n1 && r < n2)
        {
            if(g[l] <= s[r])
            {
               count++;
               l++;
               r++;
            }
            else if(g[l] > s[r])
            {
                r++;
            }
        }

        return count;
    }
}