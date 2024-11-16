class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        int n = nums.length;
        if(n == 0 || n < k)
        {
            return new int[0];
        }

        int arr[] = new int[n-k+1];
        int i=0;
        int j=k-1;
        int idx = 0;

        while(j < n)
        {
            if(solved(nums,i,j) == true)
            {
                arr[idx] = nums[j];
                idx++;
            }
            else
            {
                arr[idx++] = -1;
            }

            i++;
            j++;

        }

        return arr;
    }

     boolean solved(int[] nums , int start , int end)
        {
            for(int i=start; i<end; i++)
            {
                if(nums[i]+1 != nums[i+1])
                {
                    return false;
                }
            }

            return true;
        }

}