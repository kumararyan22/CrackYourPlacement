class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int i=0;
       
       for(int j=0; j<n; j++)
       {
        if(nums[j] != val)
        {
            nums[i] = nums[j];
            i++;
        }
       }

       return i;  // returning the length of the new array after removing elements
        
    }
}