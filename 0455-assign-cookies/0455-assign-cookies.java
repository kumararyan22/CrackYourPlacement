class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n1 = g.length;
        int n2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j=0;
        int count = 0;

        while(i < n1 && j < n2)
        {
            if(g[i] <= s[j])
            {
               count++;
               i++;
               j++;
            }
            else if(g[i] > s[j])
            {
                j++;
            }
        }

        return count;
    }
}