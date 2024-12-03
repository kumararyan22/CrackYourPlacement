class Solution {
    public int minInsertions(String s) {

        StringBuilder sb = new StringBuilder(s);
        String b = sb.reverse().toString();

        int m = s.length();
        int n = b.length();

        int insertion = m - lcs(s , b , m ,n);
        return insertion;
        
    }

    public static int lcs(String s , String b , int m , int n)
    {
        int[][] tb = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 || j==0)
                {
                    tb[i][j] = 0;
                }
            }
        }

        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(s.charAt(i-1) == b.charAt(j-1))
                {
                    tb[i][j] = 1 + tb[i-1][j-1];
                }
                else
                {
                    tb[i][j] = Math.max(tb[i][j-1] , tb[i-1][j]);
                }
            }
        }
        return tb[m][n];
    }
}