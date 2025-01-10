class Solution {
    public boolean isPosible(int[] bloomDay , int mid , int m, int k)
    {
        int count = 0;
        int numOfB = 0;

        for(int i=0; i<bloomDay.length; i++)
        {
            if(bloomDay[i] <= mid)
            {
                count++;
            }
            else
            {
                numOfB += count / k;
                count = 0;
            }
        }
        numOfB += count/k;
        return numOfB >= m;

    }


    public int minDays(int[] bloomDay, int m, int k) {
        
        long check = (long) m * k;
        if(check > bloomDay.length)
        {
            return -1;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<bloomDay.length; i++)
        {
            mini = Math.min(mini , bloomDay[i]);
            maxi = Math.max(maxi , bloomDay[i]);
        }

        int low = mini;
        int high = maxi;
        int res = maxi;

        while(low <= high)
        {
            int mid = low+(high-low)/2;

            if(isPosible(bloomDay,mid,m,k) == true)
            {
                res = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return res;
    }
}