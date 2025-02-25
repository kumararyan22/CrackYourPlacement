class Solution {
    int M = 1000000007;

    public int numOfSubarrays(int[] arr) {
        
        int n = arr.length;

        int count= 0 ;
        int even = 1;
        int odd = 0;
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            sum += arr[i];

            if(sum % 2 == 0)
            {
                count = (count + odd) % M;
                even++;
            }
            else
            {
                count = (count + even) % M;
                odd++;
            }
        }

        return count;
    }
}