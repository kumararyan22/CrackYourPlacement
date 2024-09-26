class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        int sum = 0;
        for(int i=0; i<k; i++)
        {
            sum += cardPoints[i];
        }

        if(k == cardPoints.length)
        {
            return sum;
        }


        int start = k;
        int end = n-1;
        int ans = sum;

        while(start > 0)
        {
        sum -= cardPoints[--start];
        sum += cardPoints[end--];

        ans = Math.max(ans , sum);
        }

        return ans;
    }
}