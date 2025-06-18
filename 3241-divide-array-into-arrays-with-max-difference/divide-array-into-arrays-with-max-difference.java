class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        int row=0;

        Arrays.sort(nums);

        for(int i=0; i<=n-3; i+=3)
        {
            int[] arr = new int[3];
            int idx = 0;

            for(int j=i; j<i+3; j++)
            {
                if(nums[j]-nums[i] <= k)
                {
                    arr[idx++] = nums[j];
                }
                else
                {
                    return new int[0][0];
                }
            }
            ans[row] = arr;
            row++;
        }

        return ans;
    }
}
