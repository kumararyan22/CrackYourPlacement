class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int n =weights.length;

        int start = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
           start = Math.max(start , weights[i]);
        }

        int end = 0;
        for(int i=0; i<n; i++)
        {
            end += weights[i];
        }


        int result = -1;

        while(start <= end)
        {
            int maxMid = start + (end - start)/2;

            if(isValid(weights,n,days,maxMid) == true)
            {
                 result = maxMid;
                 end = maxMid - 1;
            }
            else
            {
                start = maxMid + 1;
            }
        }

        return result;

    }


    public static boolean isValid(int[] weights, int n , int days, int maxMid)
    {
        int part = 1;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += weights[i];
            if(sum > maxMid)
            {
                part++;
                sum = weights[i];
            }

            if(part > days)
            {
                return false;
            }
        }

        return true;
    }
}
    