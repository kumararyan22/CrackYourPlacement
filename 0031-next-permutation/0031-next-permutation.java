class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int index = -1;

        for(int i=n-1; i>=1; i--)
        {
            if(nums[i] > nums[i-1])
            {
                index = i-1;
                break;
            }
        }

        if(index == -1)
        {
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>index; i--)
        {
            if(nums[index] < nums[i])
            {
                int swap = nums[index];
                nums[index] = nums[i];
                nums[i] = swap;
                break;
            }
        }

         reverse(nums, index+1, n-1);
    }


    public void reverse(int[] nums , int i, int j)
    {
        while(i < j)
        {
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;

            i++;
            j--;
        }
    }
}