class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m = accounts.length;
        int n = accounts[0].length;
        int maxWealth = Integer.MIN_VALUE;

        for(int i=0; i<m; i++)
        {
            int money = 0;
            for(int j=0; j<n; j++)
            {
                money += accounts[i][j];
            }
            if(money > maxWealth)
            {
                maxWealth = money;
            }
        }

        return maxWealth;
    }
}