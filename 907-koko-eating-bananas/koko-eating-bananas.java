class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            max = Math.max(max , piles[i]);
        }

        int low = 1;
        int high = max;
        int result = -1;

        while(low <= high)
        {
             int mid = low+(high-low)/2;
             int totalH = isSolved(piles,mid,h);

             if(totalH <= h)
             {
                result = mid;
                high = mid-1;
             }
             else
             {
                low = mid+1;
             }
        }

        return result;
        
    }

    public int isSolved(int[] piles, int mid, int h)
    {
        int n = piles.length;
        int totalfindH = 0;

        for(int i=0; i<n; i++)
        {
            totalfindH += Math.ceil((double)piles[i] / (double)mid);
        }

        return (int)totalfindH;
    }
}