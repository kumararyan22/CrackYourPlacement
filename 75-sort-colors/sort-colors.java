class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int low=0;
        int high=n-1;
        int curr=0;

        while(curr <= high)
        {
            if(nums[curr] == 0)
            {
                int temp = nums[curr];
                nums[curr] = nums[low];
                nums[low] = temp;

                low++;
                curr++;
            }
            else if(nums[curr] == 2)
            {
                int temp = nums[curr];
                nums[curr] = nums[high];
                nums[high] = temp;

                high--;
            }
            else
            {
                curr++;
            }
        }
    }
}