class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int idx=0;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int idx1=0;
        int idx2=0;

        for(int i=0; i<n; i++)
        {
            if(nums[i] % 2 == 0)
            {
                even[idx1++] = nums[i];
            }
            else
            {
                odd[idx2++] = nums[i];
            }
        } 

        int i=0; 
        int j=0;
        while(i < even.length || j < odd.length)
        {
            if(idx % 2 == 0)
            {
                ans[idx] = even[i];
                idx++;
                i++;
            }
            else
            {
                ans[idx] = odd[j];
                idx++;
                j++;
            }
        }

        return ans;

    }
}