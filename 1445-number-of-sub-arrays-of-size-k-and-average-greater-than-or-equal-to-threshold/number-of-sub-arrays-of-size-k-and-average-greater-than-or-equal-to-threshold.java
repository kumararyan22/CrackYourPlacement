class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int n = arr.length;
        int i=0;
        int j=0;
        int sum = 0;
        int count = 0;
        
        while(j < n)
        {
            sum += arr[j];

            while(j-i+1 > k && i < j)
            {
                sum -= arr[i];
                i++;
            }

            if(j-i+1 == k && (sum / k >= threshold))
            {
                count++;
            }

            j++;
        }

        return count;
        
    }
}