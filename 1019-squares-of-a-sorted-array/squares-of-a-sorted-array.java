class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // int n = nums.length;       //brute force
        // int[] ans = new int[n];

        // for(int i=0; i<n; i++)
        // {
        //     ans[i] = nums[i] * nums[i];
        // }

        // Arrays.sort(ans);
        // return ans;

       
        int n = nums.length;
        int low=0;
        int high=n-1;
        int[] ans = new int[n];
        int idx = n-1;

        while(low <= high)
        {
             int left = nums[low] * nums[low];
             int right = nums[high] * nums[high];

             if(left > right)
             {
                ans[idx] = left;
                low++;
             }
             else
             {
                ans[idx] = right;
                high--;
             }

             idx--;
        }

        return ans;
        
    }
}