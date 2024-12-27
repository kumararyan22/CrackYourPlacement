class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
        int n = values.length;
        int ans = Integer.MIN_VALUE;

        int m = values[0]+0;

        for(int i=1; i<n; i++)
        {
            if(values[i] - i + m > ans)
            {
                ans = values[i] - i + m;
            }

            if(values[i]+i > m)
            {
                m = values[i]+i;
            }
        }
        
        return ans;
    }
}