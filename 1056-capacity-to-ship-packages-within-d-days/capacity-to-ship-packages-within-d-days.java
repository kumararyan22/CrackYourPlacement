class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
       int n= weights.length;
       int totalSum = 0;
       int max = 0;
       for(int i=0; i<n; i++)
       {
         totalSum += weights[i];
         max = Math.max(max , weights[i]);
       }

       int low=max;
       int high=totalSum;

       int ans = -1;

       while(low <= high)
       {
          int mid = low+(high-low)/2;
          if(solve(weights,n,mid,days) == true)
          {
            ans = mid;
            high = mid-1;
          }
          else
          {
            low =mid+1;
          }
       }

       return ans;
    }

    public boolean solve(int[] weights,int n,int capacity, int days)
    {
        int count=1;
        int sum=0;

        for(int i=0; i<n; i++)
        {
            sum += weights[i];
            if(sum > capacity)
            {
                count++;
                sum = weights[i];
            }
        }

        return count <= days;
    }
} 