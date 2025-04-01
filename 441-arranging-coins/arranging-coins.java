class Solution {
    public int arrangeCoins(int n) {
        
         int idx = 0;

        for(int i=1; i<=n; i++)
        {
             n -= i;
             idx++;

             if(n == 0 && n < 0)
             {
                break;
             }
        }

        return idx;
    }
}